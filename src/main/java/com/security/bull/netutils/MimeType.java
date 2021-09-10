
package com.security.bull.netutils;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MimeType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="application/atom+xml"/>
 *     &lt;enumeration value="application/ecmascript"/>
 *     &lt;enumeration value="application/EDI-X12"/>
 *     &lt;enumeration value="application/EDIFACT"/>
 *     &lt;enumeration value="application/json"/>
 *     &lt;enumeration value="application/javascript"/>
 *     &lt;enumeration value="application/octet-stream"/>
 *     &lt;enumeration value="application/ogg"/>
 *     &lt;enumeration value="application/pdf"/>
 *     &lt;enumeration value="application/postscript"/>
 *     &lt;enumeration value="application/rdf+xml"/>
 *     &lt;enumeration value="application/rss+xml"/>
 *     &lt;enumeration value="application/soap+xml"/>
 *     &lt;enumeration value="application/font-woff"/>
 *     &lt;enumeration value="application/xhtml+xml"/>
 *     &lt;enumeration value="application/xml-dtd"/>
 *     &lt;enumeration value="application/xop+xml"/>
 *     &lt;enumeration value="application/zip"/>
 *     &lt;enumeration value="application/x-gzip"/>
 *     &lt;enumeration value="audio/basic"/>
 *     &lt;enumeration value="audio/L24"/>
 *     &lt;enumeration value="audio/mp4"/>
 *     &lt;enumeration value="audio/mpeg"/>
 *     &lt;enumeration value="audio/ogg"/>
 *     &lt;enumeration value="audio/vorbis"/>
 *     &lt;enumeration value="audio/vnd.rn-realaudio"/>
 *     &lt;enumeration value="audio/vnd.wave"/>
 *     &lt;enumeration value="audio/webm"/>
 *     &lt;enumeration value="image/gif"/>
 *     &lt;enumeration value="image/jpeg"/>
 *     &lt;enumeration value="image/pjpeg"/>
 *     &lt;enumeration value="image/png"/>
 *     &lt;enumeration value="image/svg+xml"/>
 *     &lt;enumeration value="image/tiff"/>
 *     &lt;enumeration value="image/vnd.microsoft.icon"/>
 *     &lt;enumeration value="message/http"/>
 *     &lt;enumeration value="message/imdn+xml"/>
 *     &lt;enumeration value="message/partial"/>
 *     &lt;enumeration value="message/rfc822"/>
 *     &lt;enumeration value="model/example"/>
 *     &lt;enumeration value="model/iges"/>
 *     &lt;enumeration value="model/mesh"/>
 *     &lt;enumeration value="model/vrml"/>
 *     &lt;enumeration value="model/x3d+binary"/>
 *     &lt;enumeration value="model/x3d+vrml"/>
 *     &lt;enumeration value="model/x3d+xml"/>
 *     &lt;enumeration value="multipart/mixed"/>
 *     &lt;enumeration value="multipart/alternative"/>
 *     &lt;enumeration value="multipart/related"/>
 *     &lt;enumeration value="multipart/form-data"/>
 *     &lt;enumeration value="multipart/signed"/>
 *     &lt;enumeration value="multipart/encrypted"/>
 *     &lt;enumeration value="text/cmd"/>
 *     &lt;enumeration value="text/css"/>
 *     &lt;enumeration value="text/csv"/>
 *     &lt;enumeration value="text/html"/>
 *     &lt;enumeration value="text/javascript (Obsolete)"/>
 *     &lt;enumeration value="text/plain"/>
 *     &lt;enumeration value="text/vcard"/>
 *     &lt;enumeration value="application/xml"/>
 *     &lt;enumeration value="video/mpeg"/>
 *     &lt;enumeration value="video/mp4"/>
 *     &lt;enumeration value="video/ogg"/>
 *     &lt;enumeration value="video/quicktime"/>
 *     &lt;enumeration value="video/webm"/>
 *     &lt;enumeration value="video/x-matroska"/>
 *     &lt;enumeration value="video/x-ms-wmv"/>
 *     &lt;enumeration value="video/x-flv"/>
 *     &lt;enumeration value="application/vnd.oasis.opendocument.text"/>
 *     &lt;enumeration value="application/vnd.oasis.opendocument.spreadsheet"/>
 *     &lt;enumeration value="application/vnd.oasis.opendocument.presentation"/>
 *     &lt;enumeration value="application/vnd.oasis.opendocument.graphics"/>
 *     &lt;enumeration value="application/vnd.ms-excel"/>
 *     &lt;enumeration value="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"/>
 *     &lt;enumeration value="application/vnd.ms-powerpoint"/>
 *     &lt;enumeration value="application/vnd.openxmlformats-officedocument.presentationml.presentation"/>
 *     &lt;enumeration value="application/vnd.openxmlformats-officedocument.wordprocessingml.document"/>
 *     &lt;enumeration value="application/vnd.mozilla.xul+xml"/>
 *     &lt;enumeration value="application/vnd.google-earth.kml+xml"/>
 *     &lt;enumeration value="application/x-www-form-urlencoded"/>
 *     &lt;enumeration value="application/x-dvi"/>
 *     &lt;enumeration value="application/x-latex"/>
 *     &lt;enumeration value="application/x-font-ttf"/>
 *     &lt;enumeration value="application/x-shockwave-flash"/>
 *     &lt;enumeration value="application/x-stuffit"/>
 *     &lt;enumeration value="application/x-rar-compressed"/>
 *     &lt;enumeration value="application/x-tar"/>
 *     &lt;enumeration value="text/x-gwt-rpc"/>
 *     &lt;enumeration value="text/x-jquery-tmpl"/>
 *     &lt;enumeration value="application/x-javascript"/>
 *     &lt;enumeration value="application/x-deb"/>
 *     &lt;enumeration value="audio/x-aac"/>
 *     &lt;enumeration value="audio/x-caf"/>
 *     &lt;enumeration value="application/x-mpegURL"/>
 *     &lt;enumeration value="image/x-xcf"/>
 *     &lt;enumeration value="application/x-pkcs12"/>
 *     &lt;enumeration value="application/x-pkcs12"/>
 *     &lt;enumeration value="application/x-pkcs7-certificates"/>
 *     &lt;enumeration value="application/x-pkcs7-certificates"/>
 *     &lt;enumeration value="application/x-pkcs7-certreqresp"/>
 *     &lt;enumeration value="application/x-pkcs7-mime"/>
 *     &lt;enumeration value="application/x-pkcs7-mime"/>
 *     &lt;enumeration value="application/x-pkcs7-signature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MimeType", namespace = "http://www.bull.security.com/netUtils")
@XmlEnum
public enum MimeType {


    /**
     * Atom feeds
     * 
     */
    @XmlEnumValue("application/atom+xml")
    APPLICATION_ATOM_XML("application/atom+xml"),

    /**
     * ECMAScript/JavaScript; Defined in RFC 4329
     *     				(equivalent to application/javascript but with stricter processing rules)
     *     				
     * 
     */
    @XmlEnumValue("application/ecmascript")
    APPLICATION_ECMASCRIPT("application/ecmascript"),

    /**
     * EDI X12 data; Defined in RFC 1767
     * 
     */
    @XmlEnumValue("application/EDI-X12")
    APPLICATION_EDI_X_12("application/EDI-X12"),

    /**
     * EDI EDIFACT data; Defined in RFC 1767
     * 
     */
    @XmlEnumValue("application/EDIFACT")
    APPLICATION_EDIFACT("application/EDIFACT"),

    /**
     * JavaScript Object Notation JSON; Defined in RFC 4627
     * 
     */
    @XmlEnumValue("application/json")
    APPLICATION_JSON("application/json"),

    /**
     * ECMAScript/JavaScript; Defined in RFC 4329
     *     				(equivalent to application/ecmascript but with looser processing rules)
     *     				It is not accepted in IE 8 or earlier - text/javascript is accepted but
     *     				it is defined as obsolete in RFC 4329. The "type" attribute of the 'script'
     *     				tag in HTML5 is optional and in practice omitting the media type of JavaScript
     *     				programs is the most interoperable solution since all browsers have always
     *     				assumed the correct default even before HTML5.
     *     				
     * 
     */
    @XmlEnumValue("application/javascript")
    APPLICATION_JAVASCRIPT("application/javascript"),

    /**
     * Arbitrary binary data.
     *     				Generally speaking this type identifies files that are not associated
     *     				with a specific application. Contrary to past assumptions by software
     *     				packages such as Apache this is not a type that should be applied to
     *     				unknown files. In such a case, a server or application should not indicate
     *     				a content type, as it may be incorrect, but rather, should omit the type
     *     				in order to allow the recipient to guess the type.
     *     				
     * 
     */
    @XmlEnumValue("application/octet-stream")
    APPLICATION_OCTET_STREAM("application/octet-stream"),

    /**
     * Ogg, a multimedia bitstream container format; Defined in RFC 5334
     * 
     */
    @XmlEnumValue("application/ogg")
    APPLICATION_OGG("application/ogg"),

    /**
     * Portable Document Format, PDF has been in use for document
     *     				exchange on the Internet since 1993; Defined in RFC 3778
     *     				
     * 
     */
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf"),

    /**
     * PostScript; Defined in RFC 2046
     * 
     */
    @XmlEnumValue("application/postscript")
    APPLICATION_POSTSCRIPT("application/postscript"),

    /**
     * Resource Description Framework; Defined by RFC 3870
     * 
     */
    @XmlEnumValue("application/rdf+xml")
    APPLICATION_RDF_XML("application/rdf+xml"),

    /**
     * RSS feeds
     * 
     */
    @XmlEnumValue("application/rss+xml")
    APPLICATION_RSS_XML("application/rss+xml"),

    /**
     * SOAP; Defined by RFC 3902
     * 
     */
    @XmlEnumValue("application/soap+xml")
    APPLICATION_SOAP_XML("application/soap+xml"),

    /**
     * Web Open Font Format;
     *     				(candidate recommendation; use application/x-font-woff
     *     				until standard is official)
     * 
     */
    @XmlEnumValue("application/font-woff")
    APPLICATION_FONT_WOFF("application/font-woff"),

    /**
     * XHTML; Defined by RFC 3236
     * 
     */
    @XmlEnumValue("application/xhtml+xml")
    APPLICATION_XHTML_XML("application/xhtml+xml"),

    /**
     * DTD files; Defined by RFC 3023
     * 
     */
    @XmlEnumValue("application/xml-dtd")
    APPLICATION_XML_DTD("application/xml-dtd"),

    /**
     * XOP
     * 
     */
    @XmlEnumValue("application/xop+xml")
    APPLICATION_XOP_XML("application/xop+xml"),

    /**
     * ZIP archive files;
     * 
     */
    @XmlEnumValue("application/zip")
    APPLICATION_ZIP("application/zip"),

    /**
     * Gzip
     * 
     */
    @XmlEnumValue("application/x-gzip")
    APPLICATION_X_GZIP("application/x-gzip"),

    /**
     * mulaw audio at 8 kHz, 1 channel; Defined in RFC 2046
     * 
     */
    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),

    /**
     *  24bit Linear PCM audio at 8-48kHz, 1-N channels;
     *     				Defined in RFC 3190
     * 
     */
    @XmlEnumValue("audio/L24")
    AUDIO_L_24("audio/L24"),

    /**
     * MP4 audio
     * 
     */
    @XmlEnumValue("audio/mp4")
    AUDIO_MP_4("audio/mp4"),

    /**
     * MP3 or other MPEG audio; Defined in RFC 3003
     * 
     */
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg"),

    /**
     * Ogg Vorbis, Speex, Flac and other audio; Defined in RFC 5334
     * 
     */
    @XmlEnumValue("audio/ogg")
    AUDIO_OGG("audio/ogg"),

    /**
     * Vorbis encoded audio; Defined in RFC 5215
     * 
     */
    @XmlEnumValue("audio/vorbis")
    AUDIO_VORBIS("audio/vorbis"),

    /**
     * RealAudio; Documented in RealPlayer Help
     * 
     */
    @XmlEnumValue("audio/vnd.rn-realaudio")
    AUDIO_VND_RN_REALAUDIO("audio/vnd.rn-realaudio"),

    /**
     * WAV audio; Defined in RFC 2361
     * 
     */
    @XmlEnumValue("audio/vnd.wave")
    AUDIO_VND_WAVE("audio/vnd.wave"),

    /**
     * WebM open media format
     * 
     */
    @XmlEnumValue("audio/webm")
    AUDIO_WEBM("audio/webm"),

    /**
     * GIF image; Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("image/gif")
    IMAGE_GIF("image/gif"),

    /**
     * JPEG JFIF image; Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),

    /**
     * JPEG JFIF image; Associated with Internet Explorer;
     *     				Listed in ms775147(v=vs.85) - Progressive JPEG, initiated before
     *     				global browser support for progressive JPEGs (Microsoft and Firefox).
     * 
     */
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG("image/pjpeg"),

    /**
     * Portable Network Graphics; Defined in RFC 2083
     * 
     */
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),

    /**
     * SVG vector image; Defined in SVG Tiny 1.2 Specification Appendix M
     * 
     */
    @XmlEnumValue("image/svg+xml")
    IMAGE_SVG_XML("image/svg+xml"),

    /**
     * Tag Image File Format (only for Baseline TIFF); Defined in RFC 3302
     * 
     */
    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff"),

    /**
     * ICO image
     * 
     */
    @XmlEnumValue("image/vnd.microsoft.icon")
    IMAGE_VND_MICROSOFT_ICON("image/vnd.microsoft.icon"),

    /**
     * Defined in RFC 2616
     * 
     */
    @XmlEnumValue("message/http")
    MESSAGE_HTTP("message/http"),

    /**
     * IMDN Instant Message Disposition Notification; Defined in RFC 5438
     * 
     */
    @XmlEnumValue("message/imdn+xml")
    MESSAGE_IMDN_XML("message/imdn+xml"),

    /**
     * Email; Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("message/partial")
    MESSAGE_PARTIAL("message/partial"),

    /**
     * Email; EML files, MIME files, MHT files, MHTML files;
     *     				Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("message/rfc822")
    MESSAGE_RFC_822("message/rfc822"),

    /**
     * Defined in RFC 4735
     * 
     */
    @XmlEnumValue("model/example")
    MODEL_EXAMPLE("model/example"),

    /**
     * IGS files, IGES files; Defined in RFC 2077
     * 
     */
    @XmlEnumValue("model/iges")
    MODEL_IGES("model/iges"),

    /**
     * MSH files, MESH files; Defined in RFC 2077, SILO files
     * 
     */
    @XmlEnumValue("model/mesh")
    MODEL_MESH("model/mesh"),

    /**
     * WRL files, VRML files; Defined in RFC 2077
     * 
     */
    @XmlEnumValue("model/vrml")
    MODEL_VRML("model/vrml"),

    /**
     * X3D ISO standard for representing 3D computer graphics,
     *     				X3DB binary files
     * 
     */
    @XmlEnumValue("model/x3d+binary")
    MODEL_X_3_D_BINARY("model/x3d+binary"),

    /**
     * X3D ISO standard for representing 3D computer graphics,
     *     				X3DV VRML files
     * 
     */
    @XmlEnumValue("model/x3d+vrml")
    MODEL_X_3_D_VRML("model/x3d+vrml"),

    /**
     * X3D ISO standard for representing 3D computer graphics,
     *     				X3D XML files
     * 
     */
    @XmlEnumValue("model/x3d+xml")
    MODEL_X_3_D_XML("model/x3d+xml"),

    /**
     * MIME Email; Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("multipart/mixed")
    MULTIPART_MIXED("multipart/mixed"),

    /**
     * MIME Email; Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("multipart/alternative")
    MULTIPART_ALTERNATIVE("multipart/alternative"),

    /**
     * MIME Email; Defined in RFC 2387 and used by MHTML (HTML mail)
     * 
     */
    @XmlEnumValue("multipart/related")
    MULTIPART_RELATED("multipart/related"),

    /**
     * MIME Webform; Defined in RFC 2388
     * 
     */
    @XmlEnumValue("multipart/form-data")
    MULTIPART_FORM_DATA("multipart/form-data"),

    /**
     * Defined in RFC 1847
     * 
     */
    @XmlEnumValue("multipart/signed")
    MULTIPART_SIGNED("multipart/signed"),

    /**
     * Defined in RFC 1847
     * 
     */
    @XmlEnumValue("multipart/encrypted")
    MULTIPART_ENCRYPTED("multipart/encrypted"),

    /**
     * commands; subtype resident in Gecko browsers like Firefox 3.5
     * 
     */
    @XmlEnumValue("text/cmd")
    TEXT_CMD("text/cmd"),

    /**
     * Cascading Style Sheets; Defined in RFC 2318
     * 
     */
    @XmlEnumValue("text/css")
    TEXT_CSS("text/css"),

    /**
     * Comma-separated values; Defined in RFC 4180
     * 
     */
    @XmlEnumValue("text/csv")
    TEXT_CSV("text/csv"),

    /**
     * HTML; Defined in RFC 2854
     * 
     */
    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),

    /**
     * JavaScript; Defined in and obsoleted by RFC 4329 in order
     *     				to discourage its usage in favor of application/javascript. However, 
     *     				text/javascript is allowed in HTML 4 and 5 and, unlike application/javascript,
     *     				has cross-browser support. The "type" attribute of the 'script' tag in HTML5
     *     				is optional and there is no need to use it at all since all browsers have
     *     				always assumed the correct default (even in HTML 4 where it was required by the specification).
     *     				
     * 
     */
    @XmlEnumValue("text/javascript (Obsolete)")
    TEXT_JAVASCRIPT_OBSOLETE("text/javascript (Obsolete)"),

    /**
     * Textual data; Defined in RFC 2046 and RFC 3676
     * 
     */
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),

    /**
     * vCard (contact information); Defined in RFC 6350
     * 
     */
    @XmlEnumValue("text/vcard")
    TEXT_VCARD("text/vcard"),

    /**
     * Extensible Markup Language; Defined in RFC 3023
     * 
     */
    @XmlEnumValue("application/xml")
    APPLICATION_XML("application/xml"),

    /**
     * MPEG-1 video with multiplexed audio; Defined in RFC 2045 and RFC 2046
     * 
     */
    @XmlEnumValue("video/mpeg")
    VIDEO_MPEG("video/mpeg"),

    /**
     * MP4 video; Defined in RFC 4337
     * 
     */
    @XmlEnumValue("video/mp4")
    VIDEO_MP_4("video/mp4"),

    /**
     * Ogg Theora or other video (with audio); Defined in RFC 5334
     * 
     */
    @XmlEnumValue("video/ogg")
    VIDEO_OGG("video/ogg"),

    /**
     * QuickTime video
     * 
     */
    @XmlEnumValue("video/quicktime")
    VIDEO_QUICKTIME("video/quicktime"),

    /**
     * WebM Matroska-based open media format
     * 
     */
    @XmlEnumValue("video/webm")
    VIDEO_WEBM("video/webm"),

    /**
     * Matroska open media format
     * 
     */
    @XmlEnumValue("video/x-matroska")
    VIDEO_X_MATROSKA("video/x-matroska"),

    /**
     * Windows Media Video; Documented in Microsoft KB 288102
     * 
     */
    @XmlEnumValue("video/x-ms-wmv")
    VIDEO_X_MS_WMV("video/x-ms-wmv"),

    /**
     * Flash video (FLV files)
     * 
     */
    @XmlEnumValue("video/x-flv")
    VIDEO_X_FLV("video/x-flv"),

    /**
     * OpenDocument Text
     * 
     */
    @XmlEnumValue("application/vnd.oasis.opendocument.text")
    APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT("application/vnd.oasis.opendocument.text"),

    /**
     * OpenDocument Spreadsheet
     * 
     */
    @XmlEnumValue("application/vnd.oasis.opendocument.spreadsheet")
    APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET("application/vnd.oasis.opendocument.spreadsheet"),

    /**
     * OpenDocument Presentation
     * 
     */
    @XmlEnumValue("application/vnd.oasis.opendocument.presentation")
    APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION("application/vnd.oasis.opendocument.presentation"),

    /**
     * OpenDocument Graphics
     * 
     */
    @XmlEnumValue("application/vnd.oasis.opendocument.graphics")
    APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS("application/vnd.oasis.opendocument.graphics"),

    /**
     * Microsoft Excel files
     * 
     */
    @XmlEnumValue("application/vnd.ms-excel")
    APPLICATION_VND_MS_EXCEL("application/vnd.ms-excel"),

    /**
     * Microsoft Excel 2007 files
     * 
     */
    @XmlEnumValue("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),

    /**
     * Microsoft Powerpoint files
     * 
     */
    @XmlEnumValue("application/vnd.ms-powerpoint")
    APPLICATION_VND_MS_POWERPOINT("application/vnd.ms-powerpoint"),

    /**
     * Microsoft Powerpoint 2007 files
     * 
     */
    @XmlEnumValue("application/vnd.openxmlformats-officedocument.presentationml.presentation")
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION("application/vnd.openxmlformats-officedocument.presentationml.presentation"),

    /**
     * Microsoft Word 2007 files
     * 
     */
    @XmlEnumValue("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT("application/vnd.openxmlformats-officedocument.wordprocessingml.document"),

    /**
     * Mozilla XUL files
     * 
     */
    @XmlEnumValue("application/vnd.mozilla.xul+xml")
    APPLICATION_VND_MOZILLA_XUL_XML("application/vnd.mozilla.xul+xml"),

    /**
     * KML files (e.g. for Google Earth)
     * 
     */
    @XmlEnumValue("application/vnd.google-earth.kml+xml")
    APPLICATION_VND_GOOGLE_EARTH_KML_XML("application/vnd.google-earth.kml+xml"),

    /**
     * Form Encoded Data; Documented in HTML 4.01 Specification, Section 17.13.4.1
     * 
     */
    @XmlEnumValue("application/x-www-form-urlencoded")
    APPLICATION_X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded"),

    /**
     * device-independent document in DVI format
     * 
     */
    @XmlEnumValue("application/x-dvi")
    APPLICATION_X_DVI("application/x-dvi"),

    /**
     * LaTeX files
     * 
     */
    @XmlEnumValue("application/x-latex")
    APPLICATION_X_LATEX("application/x-latex"),

    /**
     * TrueType Font No registered MIME type, but this is the most commonly used
     * 
     */
    @XmlEnumValue("application/x-font-ttf")
    APPLICATION_X_FONT_TTF("application/x-font-ttf"),

    /**
     * Adobe Flash files for example with the extension .swf
     * 
     */
    @XmlEnumValue("application/x-shockwave-flash")
    APPLICATION_X_SHOCKWAVE_FLASH("application/x-shockwave-flash"),

    /**
     * StuffIt archive files
     * 
     */
    @XmlEnumValue("application/x-stuffit")
    APPLICATION_X_STUFFIT("application/x-stuffit"),

    /**
     * RAR archive files
     * 
     */
    @XmlEnumValue("application/x-rar-compressed")
    APPLICATION_X_RAR_COMPRESSED("application/x-rar-compressed"),

    /**
     * Tarball files
     * 
     */
    @XmlEnumValue("application/x-tar")
    APPLICATION_X_TAR("application/x-tar"),

    /**
     * GoogleWebToolkit data
     * 
     */
    @XmlEnumValue("text/x-gwt-rpc")
    TEXT_X_GWT_RPC("text/x-gwt-rpc"),

    /**
     * jQuery template data
     * 
     */
    @XmlEnumValue("text/x-jquery-tmpl")
    TEXT_X_JQUERY_TMPL("text/x-jquery-tmpl"),

    /**
     * JavaScript
     * 
     */
    @XmlEnumValue("application/x-javascript")
    APPLICATION_X_JAVASCRIPT("application/x-javascript"),

    /**
     * deb (file format), a software package format used by the Debian project
     * 
     */
    @XmlEnumValue("application/x-deb")
    APPLICATION_X_DEB("application/x-deb"),

    /**
     * .aac audio files
     * 
     */
    @XmlEnumValue("audio/x-aac")
    AUDIO_X_AAC("audio/x-aac"),

    /**
     * Apple's CAF audio files
     * 
     */
    @XmlEnumValue("audio/x-caf")
    AUDIO_X_CAF("audio/x-caf"),

    /**
     * .m3u8 variant playlist
     * 
     */
    @XmlEnumValue("application/x-mpegURL")
    APPLICATION_X_MPEG_URL("application/x-mpegURL"),

    /**
     * GIMP image file
     * 
     */
    @XmlEnumValue("image/x-xcf")
    IMAGE_X_XCF("image/x-xcf"),

    /**
     * p12 files
     * 
     */
    @XmlEnumValue("application/x-pkcs12")
    APPLICATION_X_PKCS_12("application/x-pkcs12"),

    /**
     * p7b files
     * 
     */
    @XmlEnumValue("application/x-pkcs7-certificates")
    APPLICATION_X_PKCS_7_CERTIFICATES("application/x-pkcs7-certificates"),

    /**
     * p7r files
     * 
     */
    @XmlEnumValue("application/x-pkcs7-certreqresp")
    APPLICATION_X_PKCS_7_CERTREQRESP("application/x-pkcs7-certreqresp"),

    /**
     * p7c files
     * 
     */
    @XmlEnumValue("application/x-pkcs7-mime")
    APPLICATION_X_PKCS_7_MIME("application/x-pkcs7-mime"),

    /**
     * p7s files
     * 
     */
    @XmlEnumValue("application/x-pkcs7-signature")
    APPLICATION_X_PKCS_7_SIGNATURE("application/x-pkcs7-signature");
    private final String value;

    MimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MimeType fromValue(String v) {
        for (MimeType c: MimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
