package net.gainde2000.cf;

import java.util.Arrays;
import java.util.List;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Main2Service<T>
{
  private String service_address;
  private Class<T> service_class;
  private static final String[] ALLOWED_CLASS_NAMES = { "Admin", "AdminSig", "SigOps" };
  private static final String[] ALLOWED_CLASS_PACKAGES = {"com.security.bull.signserver.adminsig.service.v1_3_0", "com.bull.security.coreserver.admin.service", "com.bull.security.coreserver.admin.service.internal", "com.bull.security.signserver.adminsig.service", "com.bull.security.signserver.adminsig.service.internal", "com.bull.security.signserver.sigops.service", "com.bull.security.signserver.sigops.service.internal" };
  
  public Main2Service(String serviceAddress, Class<T> serviceClass)
  {
    if ((serviceAddress == null) || (serviceAddress.isEmpty())) {
      throw new IllegalArgumentException("Web-service's end-point address cannot be null or empty.");
    }
    if (serviceClass == null) {
      throw new IllegalArgumentException("Web-service's class cannot be null.");
    }
    if (!isClassAllowed(serviceClass)) {
      throw new IllegalArgumentException(serviceClass.getName() + " cannot be used to instantiate the web service");
    }
    this.service_address = serviceAddress;
    this.service_class = serviceClass;
  }
  
  public T getService()
  {
    return (T)getService(null);
  }
  
  @SuppressWarnings("unchecked")
public T getService(JAXBDataBinding dataBinding)
  {
    JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    factory.setServiceClass(this.service_class);
    factory.setDataBinding(dataBinding);
    factory.setAddress(this.service_address);
    return (T)factory.create();
  }
  
  public static final boolean isClassAllowed(Class<?> serviceClass)
  {
    if (serviceClass == null) {
      return false;
    }
    List<String> allowedClassNames = Arrays.asList(ALLOWED_CLASS_NAMES);
    List<String> allowedClassPackages = Arrays.asList(ALLOWED_CLASS_PACKAGES);
    
    String classSimpleName = serviceClass.getSimpleName();
    String classPackageName = serviceClass.getPackage().getName();
    if (!allowedClassNames.contains(classSimpleName)) {
      return false;
    }
    if (!allowedClassPackages.contains(classPackageName)) {
      return false;
    }
    return true;
  }
}

