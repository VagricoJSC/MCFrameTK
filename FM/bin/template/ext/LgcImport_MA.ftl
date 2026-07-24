<#assign pkgList = pkgList()?word_list>
<@wrtAstImp pkg="mcframe.commonMA.constant"/>
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
<@wrtAstImp pkg="mcframe.serverMA.dbc"/>
<#if S("PACKAGE")!="mcframe.serverMAUC.MAUCL0060">
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
</#if>
import static mcframe.commonMA.notice.MA_Msg.*;
<#if S("PACKAGE")!="mcframe.serverMAUC.MAUCL0010">
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
</#if>
<#if S("PACKAGE")!="mcframe.serverMAUC.MAUCL7080">
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
</#if>
<#if S("PACKAGE")!="mcframe.serverMAUC.MAUCL0020">
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
</#if>
<#if S("PACKAGE")!="mcframe.serverMAUC.MAUCL0030">
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
</#if>
<#if S("PACKAGE")!="mcframe.serverMAUC.MAUCL0060">
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
</#if>

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;

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