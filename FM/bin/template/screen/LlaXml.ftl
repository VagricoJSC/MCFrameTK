<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/screen/ACTypeXmlBlock.ftl" as ACT_B>
<#import "/screen/LabelXmlBlock.ftl" as LAB_B>
<#import "/screen/LayoutXmlBlock.ftl" as LYT_B>
<?xml version="1.0" encoding="UTF-8"?>
<@REV.XML_COMMENT/>
<@REV.REV_XML_COMMENT/>

<mcframe>
<#if B("HAS_ITEM_ACTYPE")><MCACType>
<@ACT_B.PKG_ACT_XML "\t"/>
</MCACType>
</#if>
<MCLabel>
<@LAB_B.PKG_LAB_XML "\t"/>
</MCLabel>

<@TRIMLINE>
<MCLayout>
<@LYT_B.PKG_LYT_XML "\t"/>
</MCLayout>
</@TRIMLINE>
</mcframe>