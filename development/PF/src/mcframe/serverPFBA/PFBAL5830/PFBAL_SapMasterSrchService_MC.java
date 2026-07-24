package mcframe.serverPFBA.PFBAL5830;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.*;
import mcframe.serverPFUD.PFUDL5040.*;
import mcframe.serverCore.requester.MCSimpleRequester;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBAL_SapMasterSrchService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBAL_SapMasterSrchService_MC extends PFBAL_SapMasterSrchService_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostCenter_Srch01オペレーション.<p>
	 *
	 */
	public class CostCenter_Srch01 extends PFBAL_SapMasterSrchService_MC_A.CostCenter_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected String createURL(String serviceURLBaseStr) {
			String serviceUrlStr = PFUDL_ODataURLBuilder.createInstance(serviceURLBaseStr)
					.select("CostCenter", "ProfitCenter", "ValidityStartDate", "ValidityEndDate").buildURL();
			return serviceUrlStr;
		}
		
		
		@Override
		protected MCSimpleRequester createRequester() {
			MCSimpleRequester rq = super.createRequester();
			setBasicAuth(rq, up0().ext_sys_cd());
			rq.setMethod("GET");
			return rq;
		}
		
		@Override
		protected void handleResponse(String response) {

			List<Map<String, Object>> nodes = PFUDL_ODataResponseParser.responseToChildNodes(response);
			MCList<CostCenter_DtlR> costCenterL = MCList.create(CostCenter_DtlR.class);
			for (Map<String, Object> node : nodes) {
				costCenterL.add(toCostCenter(node));
			}
			
			down0().setAll(costCenterL);
		}

		protected CostCenter_DtlR toCostCenter(Map<String, Object> node) {
			CostCenter_DtlR costCenterR = CostCenter_DtlR.create();
			
			costCenterR.cost_center(PFUDL_ODataResponseParser.convertField("CostCenter", _metaData, node));
			costCenterR.profit_center(PFUDL_ODataResponseParser.convertField("ProfitCenter", _metaData, node));
			costCenterR.validity_start_date(PFUDL_ODataResponseParser.convertField("ValidityStartDate", _metaData, node));
			costCenterR.validity_end_date(PFUDL_ODataResponseParser.convertField("ValidityEndDate", _metaData, node));
			
			return costCenterR;
		}
	}

	//FMCB CUSTOM END
}