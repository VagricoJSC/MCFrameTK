<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/logic/ACTypeXmlBlock.ftl" as ACT_B>
<#import "/logic/LabelXmlBlock.ftl" as LAB_B>
<?xml version="1.0" encoding="UTF-8"?>
<@REV.XML_COMMENT/>
<@REV.REV_XML_COMMENT/>

<mcframe>
<#if IS_GEN_ACTYPE()><MCACType>
<@ACT_B.PKG_ACT_XML "\t"/>
</MCACType></#if>
<MCLabel>
<@LAB_B.PKG_LAB_XML "\t"/>
</MCLabel>
</mcframe>

<#function IS_GEN_ACTYPE>
<#assign ACTYPE_OPES=GET_SUBKEYS_FROM_XML("MCACType." + S("MODULE_ID") + "." + S("ID") + ".")/>
<#if ACTYPE_OPES?size==0&&S("ACTYPE")==""><#return false></#if>
<#if ACTYPE_OPES?size==1&&ACTYPE_OPES?seq_contains(METHOD_ID)><#return false></#if>
<#return true>
</#function>