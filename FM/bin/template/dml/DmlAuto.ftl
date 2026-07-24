<#assign CLASS_MODIFIER="abstract "/>
<#assign CLASS_NAME=S("BLOCK_ID") + "_DML_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), S(S("BLOCK_ID") + "_CLASS_SUFFIX")) + "_A"/>
<#assign SUPER_CLASS_NAME=S(S("BLOCK_ID") + "_SUPER_DML_CLASS")/>
<#include F("FTL.DML.AUTO_BODY")/>