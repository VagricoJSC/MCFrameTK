<#assign CLASS_MODIFIER="abstract "/>
<#assign CONT_ROW_CNAME=S("BLOCK_ID") + B("IS_DAO")?string("_","") + "R"/>
<#assign CLASS_NAME=S("BLOCK_ID") + B("IS_DAO")?string("_","") + "L_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), S(S("BLOCK_ID") + "_CLASS_SUFFIX")) + "_A"/>
<#assign SUPER_CLASS_NAME=S(S("BLOCK_ID") + "_SUPER_LIST_CLASS") + "<E>"/>
<#include F("FTL.DATASET.AUTO_BODY")/>
}