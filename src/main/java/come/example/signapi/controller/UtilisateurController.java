package come.example.signapi.controller;


import come.example.signapi.message.ResponseMessage;
import come.example.signapi.model.FileInfo;
import come.example.signapi.model.InfosRetour;
import come.example.signapi.model.SignResultat;
import come.example.signapi.service.FilesStorageService;
import net.gainde2000.cf.entity.GestBD;
import net.gainde2000.cf.entity.GestUtilisateur;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


@RestController
//@Validated
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/")
public class UtilisateurController  {
    @RequestMapping(value = "/")
    public String hello() {

        return "HELLO";
    }
    private final Path root = Paths.get("uploads");
    @Autowired
    FilesStorageService storageService;
   // private static Map<String, Utilisateur> user_list = new HashMap<>();

  /*  static {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPrenom_nom("test_user");
        utilisateur.setCode_pin("1458");
        utilisateur.setId_appelant(148);
        utilisateur.setNumero_cni("44885566695");
        user_list.put(utilisateur.getCode_pin(), utilisateur);
    }*/

    private static Map<String, String> info_retour = new HashMap<>();
    private static Map<String, String> info_sign = new HashMap<>();
    private static Map<String, Object> file_signed = new HashMap<>();
    private static Map<String, MultipartFile> fichier_signe = new HashMap<>();

   /* @Override
   @PostMapping("signer/{Id}/{documentASigner}")
    public SignatureResult signatureBeneficiaire(@PathVariable String Id, @PathVariable String document) {
        SignatureResult sresult=new SignatureResult();
        Long userId=Long.parseLong(Id);
        byte[] documentASigner=document.getBytes();

        try {
            if((0==userId)||(0>userId)) {
                sresult.setErroInfo("error: userId can not be null or empty");
                sresult.setStatus("MSIGN_SRV_STATUS_REJECTED_REQUEST");
                return sresult;
            }


            net.gainde2000.cf.entity.Utilisateur u_ser=new net.gainde2000.cf.entity.Utilisateur();
            GestUtilisateur gs=new GestUtilisateur();

            String cle_pwd = gs.RechercherCLE_et_Pwd(userId);

            try {

                String[] les_Cle_pwd=cle_pwd.split("[|]");
                System.out.println("les_Cle_pwd:"+les_Cle_pwd.length);
                String cleDeSignature = les_Cle_pwd[0];
                String codePin= les_Cle_pwd[1];
                String trust_app= les_Cle_pwd[2];

                System.out.println("cleDeSignature:"+cleDeSignature);
                System.out.println("codePin:"+codePin);
                System.out.println(trust_app);

            }catch (ArrayIndexOutOfBoundsException e){
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                String exceptionAsString = sw.toString();

                sresult.setErroInfo("PIN code has to be verified error: "+exceptionAsString);
                sresult.setStatus("MSIGN_SRV_STATUS_REJECTED_REQUEST");
                return sresult;
            }
            catch (Exception e){
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                String exceptionAsString = sw.toString();

                sresult.setErroInfo("cle_pwd:"+cle_pwd+" error: "+exceptionAsString);
                sresult.setStatus("MSIGN_SRV_STATUS_REJECTED_REQUEST");
                return sresult;
            }
            String[] les_Cle_pwd=cle_pwd.split("[|]");
            String cleDeSignature = les_Cle_pwd[0];
            String codePin= les_Cle_pwd[1];
            String trust_app= les_Cle_pwd[2];

            u_ser.setSignature_Key(cleDeSignature.trim());
            u_ser.setDelegationId(userId);
            u_ser.setActivation_Code(codePin.trim());
            u_ser.setTrustedApplication(Long.parseLong(trust_app.replace("TrustedApplication=", "")));

            SignDocResponse resp= gs.Signature_PDF_ModeArchive(u_ser, documentASigner);
            sresult.setErroInfo(resp.getErrorInfo());
            sresult.setStatus(resp.getReturnStatus().value());
            if(resp.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {
                DataHandler dh=resp.getSignatureContent().getBytes();
                InputStream in=null;
                try {
                    in = dh.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                byte[] retVal=null;
                try {
                    retVal = org.apache.commons.io.IOUtils.toByteArray(in);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                sresult.setContent(retVal);
            }
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();

            sresult.setErroInfo(" error: "+exceptionAsString);
            sresult.setStatus("MSIGN_SRV_STATUS_REJECTED_REQUEST");
            return sresult;
        }
        return sresult;
    }*/


    @PostMapping("add_user/{prenomNom}/{codePin}/{numeroCni}/{idAppAppelant}")
    public String initialisation(@PathVariable String prenomNom, @PathVariable String codePin, @PathVariable String numeroCni, @PathVariable long idAppAppelant) throws FileNotFoundException {
        //Long idAppAppelant=Long.parseLong(idAppAppelant);
        if((""==prenomNom)||(null==prenomNom))
            return "error: prenomNom can not be null or empty";
        if((""==numeroCni)||(null==numeroCni))
            return "error: numeroCni can not be null or empty";
        if((""==codePin)||(null==codePin))
            return "error: codePin can not be null or empty";
        if((0==idAppAppelant)||(0>idAppAppelant))
            return "error: idAppAppelant must be greater then zero";

        if(!prenomNom.matches("[a-zA-Z0-9_ ]*"))
            return "error: illegal character in prenomNom";
        if(!(numeroCni.matches("[a-zA-Z0-9 ]*")))
            return "error: illegal character in numeroCni";
        if(!codePin.matches("[a-zA-Z0-9_ ]*"))
            return "error: illegal character in codePin";
        if((prenomNom.length()+numeroCni.length())>60)
            return "error: prenomNom and numeroCni length must be lower then or equal to 60";

        numeroCni=numeroCni.replaceAll("\\s+","");

        String cleDeSignature = "CLE_"+prenomNom.toUpperCase().replaceAll("\\s+","_")+numeroCni.replaceAll("\\s+","_");

        net.gainde2000.cf.entity.Utilisateur u_ser=new net.gainde2000.cf.entity.Utilisateur();
        GestUtilisateur gs=new GestUtilisateur();
        u_ser.setPrenom_Nom(prenomNom+" "+numeroCni);
        u_ser.setSignature_Key(cleDeSignature);
        u_ser.setActivation_Code(codePin);
        u_ser.setNumeroCNID(numeroCni);
        u_ser.setTrustedApplication(idAppAppelant);
        return gs.Enregistrer_Enroler(u_ser);
       /* user_list.put(user.getCode_pin(), user);
        if (!user_list.isEmpty()) {
            info_retour.put("ID", "47856");
           // String cle=user.getNumero_cni()+"_"+user.getPrenom_nom();
            String nom=null;
            if(user.getPrenom_nom().contains(" ")){
                nom=user.getPrenom_nom().replaceAll(" ","_");
                nom=nom+"_"+user.getNumero_cni();
            }else{
                nom=user.getPrenom_nom()+"_"+user.getNumero_cni();
            }

            info_retour.put("Cle Signataire", nom);
            info_retour.put("ID APP", "478");
            info_retour.put("CODE PIN", user.getCode_pin());
            info_retour.put("STATUS", "SUCCESS");
            //return new ResponseEntity<>(info_retour.values(), HttpStatus.OK);
            JSONObject jo = new JSONObject(info_retour);
            return jo.toString();
        }
        info_retour.put("STATUS", "FAIL");
        info_retour.put("Info_error", "Vérifier vos informations");
        JSONObject jo = new JSONObject(info_retour);
        return jo.toString();*/
    }

   /* @GetMapping("get_users")
    public ResponseEntity<Object> getUsers() {

        return new ResponseEntity<>(user_list.values(), HttpStatus.OK);
    }*/

    @GetMapping("get_info_retour/{numeroCni}/{prenomNom}")
    public List<InfosRetour> get_infos(@PathVariable String numeroCni,@PathVariable String prenomNom) {
        GestBD gsb=new GestBD();
        GestUtilisateur gs= new GestUtilisateur();
        long idUser=gs.RechercherUser_avec_CNI(numeroCni,prenomNom);
        List<InfosRetour> liste=gsb.Recherche_Un_Utilisateur2(idUser);
        return liste;
    }
    //@GetMapping("get_info_retour")
    //public List<InfosRetour> get_infos() {
        /*info_retour.put("Cle Signataire","mbaye_14855668");
        info_retour.put("ID","47856");
        info_retour.put("ID APP","478");
        info_retour.put("STATUS","SUCCESS");*/
       /* InfosRetour info=new InfosRetour();
        info.setCle_signataire(info_retour.get("Cle Signataire"));
        info.setId_app(info_retour.get("ID APP"));
        info.setId_user(info_retour.get("ID"));
        info.setStatus(info_retour.get("STATUS"));
        List<InfosRetour> liste= new ArrayList<InfosRetour>();
        liste.add(info);
        //JSONObject jo = new JSONObject(info_retour);

        return liste;
    }*/
    @GetMapping("result_sign")
    public List<Object> get_sign(){
        SignResultat result=new SignResultat();
        List<Object> liste= new ArrayList<Object>();
        result.setFichier((byte[]) file_signed.get("File"));
        result.setStatus((String) file_signed.get("STATUS"));
        result.setInfoError((String) file_signed.get("error"));
        result.setFichier1((String) file_signed.get("FileSigned"));
        liste.add(result);
        return liste;
    }

    @PostMapping("signer/{id}/{cle}/{pin}")
    public String signatureLTV(@RequestParam("file") MultipartFile file, @PathVariable String id, @PathVariable String cle,@PathVariable String pin) {

        if (info_retour.containsValue(id) && info_retour.containsValue((cle))) {
            info_sign.put("STATUS", "MSIGN_SRV_STATUS_SUCCESS");
            //info_sign.put("content",doc.toString());
            info_sign.put("ID signataire", info_retour.get("ID"));
            info_sign.put("cle signataire", info_retour.get("Cle Signataire"));
            info_sign.put("ID APP", info_retour.get("ID APP"));
            info_sign.put("CODE PIN", info_retour.get("CODE PIN"));
            String message = "";

            MultipartFile file1 = storageService.save(file);
            Resource myfile = storageService.load(file1.getOriginalFilename());
            try {
                byte[] file_byte= file1.getBytes();
                file_signed.put("File", file_byte);
                file_signed.put("STATUS", "MSIGN_SRV_STATUS_SUCCESS");
                file_signed.put("error","");
                file_signed.put("FileSigned",file1.getOriginalFilename());
                file_signed.put("CODE PIN",info_sign.get("CODE PIN"));
                JSONObject jo = new JSONObject(file_signed);
                return jo.toString();
            } catch (Exception e) {
                e.getMessage();
            }

            //ByteArrayResource file_byte =(ByteArrayResource) myfile;

            //return info_retour.values().toString();
            //return ResponseEntity.ok()
                    //.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + myfile.getFilename() + "\"" + "MSIGN_SRV_STATUS_SUCCESS").body(myfile);

        }
        file_signed.put("error","Veuillez vérifier vos informations");
        file_signed.put("File", null);
        file_signed.put("STATUS", "MSIGN_SRV_STATUS_REJECTED_REQUEST");
        JSONObject jo = new JSONObject(file_signed);
        //return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("MSIGN_SRV_STATUS_REJECTED_REQUEST"));
        return jo.toString();
    }

    @PostMapping("upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            storageService.save(file);

            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @GetMapping("files")
    public ResponseEntity<List<FileInfo>> getListFiles() {
        List<FileInfo> fileInfos = storageService.loadAll().map(path -> {
            String filename = path.getFileName().toString();
            String url = MvcUriComponentsBuilder
                    .fromMethodName(UtilisateurController.class, "getFile", path.getFileName().toString()).build().toString();

            return new FileInfo(filename, url);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
    }

    @GetMapping("files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
        Resource file = storageService.load(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }


}
