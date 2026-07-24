<#assign pkgList = pkgList()?word_list>
<@wrtAstImp pkg="mcframe.commonMA.constant"/>
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
<#if S("PACKAGE")!="mcframe.clientMAUC.MAUCP0010">
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
</#if>
<#if S("PACKAGE")!="mcframe.clientMAUC.MAUCP0020">
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
</#if>

<#macro wrtAstImp pkg>
<#if !pkgList?seq_contains(pkg)>
import ${pkg}.*;
</#if>
</#macro>

<#comment>FrameManagerが実装仕様書内容に応じて書き出すimportパッケージのリスト</#comment>
<#function pkgList>
<#assign pList="">
<#list A("IMPORT_PACKAGES") as aPkg>
<#assign pList = pList + " " + aPkg>
</#list>
<#return pList>
</#function>