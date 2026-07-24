<#import "/container/DatasetEi.ftl" as D_EI>
<#assign CLASS_MODIFIER=S(S("BLOCK_ID") + "_MODIFIER") + " "/>
<#assign CONT_ROW_CNAME=S("BLOCK_ID") + B("IS_DAO")?string("_","") + "R"/>
<#assign CLASS_NAME=S("BLOCK_ID") + B("IS_DAO")?string("_","") + "L"/>
<#assign SUPER_CLASS_NAME=S(S("BLOCK_ID") + "_SUPER_LIST_CLASS") + "<E>"/>
<#include F("FTL.DATASET.AUTO_BODY")/>
<@D_EI.CREATE/>

<@D_EI.CREATE_BY_NAME/>
}