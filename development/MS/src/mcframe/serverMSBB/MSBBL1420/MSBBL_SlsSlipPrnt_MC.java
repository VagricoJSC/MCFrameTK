package mcframe.serverMSBB.MSBBL1420;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBE.MSBEL5550.*;
import static mcframe.serverMSBB.MSBBL1420.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsSlipPrnt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsSlipPrnt_MC extends MSBBL_SlsSlipPrnt_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上実績を検索する<br>
	 */
	public class Srch01 extends MSBBL_SlsSlipPrnt_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);

			MCQueryPlan sql = MSBBL1420_MST_SLS_ACT_S01();
			executeQuery(rsltL, sql, up0());
			
			down0().addAll(editWrk(rsltL));
		}
		
		/**
		 * 同一伝票内で案件ＮＯが異なるレコードがある場合、案件ＮＯをnullにして１レコードにまとめる。
		 * @param rsltL
		 * @return
		 */
		protected MCList<Srch01_RsltR> editWrk(MCList<Srch01_RsltR> rsltL) {
			MCIndexKey idx = rsltL.createIndex(Srch01_RsltR.$dlv_slip_no, Srch01_RsltR.$dlv_slip_seq);
			MCList<Srch01_RsltR> list =  MCList.create(Srch01_RsltR.class);
			
			for (Srch01_RsltR r : rsltL.groupBy(Srch01_RsltR.$dlv_slip_no, Srch01_RsltR.$dlv_slip_seq)) {
				MCList<Srch01_RsltR> tmpL = rsltL.subList(idx, r.dlv_slip_no(), r.dlv_slip_seq());
				tmpL.sort(SortType.DESC, Srch01_RsltR.$sls_act_rev);
				Srch01_RsltR tmpR = tmpL.get(0);

				if (tmpL.size() > 1 && tmpL.groupBy(Srch01_RsltR.$wrk_no).size() > 1) {
					tmpR.wrk_no(null);
					tmpR.wrk_nm(null);
				}
				list.add(tmpR);
			}
			list.sort(Srch01_RsltR.$sls_act_no,Srch01_RsltR.$sls_act_seq);
			return list;
		}
	}
	
	
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 売上伝票を発行する<br>
	 */
	public class Prnt01 extends MSBBL_SlsSlipPrnt_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 出荷帳票発行サービスを呼び出す
			callShipSlipPrntService();
		}

		/**
		 * 売上伝票を発行する。
		 * 
		 */
		protected void callShipSlipPrntService() {

			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();

			addAll(ope.up0(), up0(), createMap_ShipRprt_Prnt01_HdrR_Prnt01_RsltR());
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());
			ope.exec();
			
			MCIndexKey ik = ope.down0().createIndex(ShipRprt_Prnt01_HdrR.$dlv_slip_no, ShipRprt_Prnt01_HdrR.$dlv_slip_seq);
			for (Prnt01_RsltR up : up0()) {
				ShipRprt_Prnt01_HdrR down = ope.down0().getFirst(ik, up.dlv_slip_no(), up.dlv_slip_seq());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());
			MSBEL_ShipRprtPrntService.ShipRprt_Upd02 opeUpd = MSBEL_ShipRprtPrntService.crtShipRprt_Upd02();
			addAll(opeUpd.up0(), up0(), createMap_ShipRprt_Upd02_HdrR_Prnt01_RsltR());
			opeUpd.exec();
		}
		/**
		 * 出荷帳票発行サービス納品伝票更新処理設定　上り電文（Prnt01_Rslt） > サービス上り電文(ShipRprt_Upd02_Hdr) 
		 */
		protected Map_ShipRprt_Upd02_HdrR_Prnt01_RsltR<ShipRprt_Upd02_HdrR,Prnt01_RsltR> createMap_ShipRprt_Upd02_HdrR_Prnt01_RsltR() {
			return new Map_ShipRprt_Upd02_HdrR_Prnt01_RsltR<ShipRprt_Upd02_HdrR, Prnt01_RsltR>();
		}
		
		public class Map_ShipRprt_Upd02_HdrR_Prnt01_RsltR<D extends ShipRprt_Upd02_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipRprt_Upd02_HdrR.$dlv_slip_no, Prnt01_RsltR.$dlv_slip_no);
				addColumnPathMap(ShipRprt_Upd02_HdrR.$dlv_slip_seq, Prnt01_RsltR.$dlv_slip_seq);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.sls_prnt_flg(true);
				dest.sls_prnt_upd_flg(true);
			}
		}
		
		/**
		 * 出荷帳票発行サービス更新処理設定　上り電文（Prnt01_Rslt） > サービス上り電文(ShipRprt_Prnt01_Hdr) 
		 * 
		 * @return
		 */
		protected Map_ShipRprt_Prnt01_HdrR_Prnt01_RsltR<ShipRprt_Prnt01_HdrR,Prnt01_RsltR> createMap_ShipRprt_Prnt01_HdrR_Prnt01_RsltR() {
			return new Map_ShipRprt_Prnt01_HdrR_Prnt01_RsltR<ShipRprt_Prnt01_HdrR, Prnt01_RsltR>();
		}

		public class Map_ShipRprt_Prnt01_HdrR_Prnt01_RsltR<D extends ShipRprt_Prnt01_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_no, Prnt01_RsltR.$dlv_slip_no);
				addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_seq, Prnt01_RsltR.$dlv_slip_seq);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.sls_prnt_flg(true);
				dest.enf_pri_prnt_flg(true);
			}
		}
	}

	//FMCB CUSTOM END
}