<#assign CLASS_MODIFIER="abstract "/>
<#assign CLASS_NAME=S("BLOCK_ID") + B("IS_DAO")?string("_","") + "R_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), S(S("BLOCK_ID") + "_CLASS_SUFFIX")) + "_A"/>
<#assign SUPER_CLASS_NAME=S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")/>
<#include F("FTL.ROW.AUTO_BODY")/>
}

<#nt>