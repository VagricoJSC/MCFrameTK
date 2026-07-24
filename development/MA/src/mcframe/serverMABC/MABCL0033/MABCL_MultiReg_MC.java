package mcframe.serverMABC.MABCL0033;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL0033.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Wg_UpdChk01オペレーション.<p>
	 *
	 * ＷＧマスタの登録前のチェックを行います。<br>
	 */
	public class Wg_UpdChk01 extends MABCL_MultiReg_MC_A.Wg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for(Wg_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.wg_cd())){
					msgList.add(new MCMessage(row, Wg_UpdChk01_DtlR.$wg_cd, MABCL0306, 
									getLabel(row, Wg_UpdChk01_DtlR.$wg_cd), row.wg_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 個別チェック
				if (!row.mfg_flg()) {
					if (!isNull(row.mfg_inst_unit_typ())) {
						msgList.add(getMsg(row, Wg_UpdChk01_DtlR.$mfg_inst_unit_typ, MABCL0258));
					}
				}
				if (!row.mfg_flg() && !row.lg_flg()) {
					if (!isNull(row.mrp_proc_typ())) {
						msgList.add(getMsg(row, Wg_UpdChk01_DtlR.$mrp_proc_typ, MABCL0259));
					}
					if (!isNull(row.alloc_margin_days())) {
						msgList.add(getMsg(row, Wg_UpdChk01_DtlR.$alloc_margin_days, MABCL0259));
					}
					if (!isNull(row.mrp_alloc_margin_days())) {
						msgList.add(getMsg(row, Wg_UpdChk01_DtlR.$mrp_alloc_margin_days, MABCL0259));
					}
					if (!isNull(row.mrp_opn_xfr_days())) {
						msgList.add(getMsg(row, Wg_UpdChk01_DtlR.$mrp_opn_xfr_days, MABCL0259));
					}
				}
				if (isNull(row.alloc_margin_days()) || !row.alloc_margin_days().isNegative()) {
					if (row.not_xfr_flg()) {
						msgList.add(new MCMessage(row, Wg_UpdChk01_DtlR.$not_xfr_flg, MABCL0045, toDispGUIIndex(row)));
					}
				}
				
			}
			return msgList;
		}

		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(Wg_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
	}
	/**
	 * Wg_Upd01オペレーション.<p>
	 *
	 * ＷＧマスタの登録を行います。<br>
	 */
	public class Wg_Upd01 extends MABCL_MultiReg_MC_A.Wg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_WG_R) {
					// ＭＲＰ発番用接頭語チェック
					checkMrpPrefix((MAM_WG_R) r);
				}
			}
		}

		/**
		 * ＭＲＰ発番用接頭語か重複していないかチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkMrpPrefix(MAM_WG_R r) {
			// NULLはチェック対象外
			if (isNull(r.mrp_prefix()) || r.del_flg()) {
				return;
			}

			MAM_WG_R t = MAM_WG_R.create("T");
			int i = execDbCount("MABCL0033_MAM_WG_S01", t,
					t.wg_cd.neq(bind("wg_cd"))
					.and(t.mrp_prefix.eq(bind("mrp_prefix")))
					.and(t.del_flg.eq(value(false))),
					r);

			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_WG_R.$mrp_prefix, MABSL0142,
						r.mrp_prefix(), toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * WgLcl_UpdChk01オペレーション.<p>
	 *
	 * ＷＧマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class WgLcl_UpdChk01 extends MABCL_MultiReg_MC_A.WgLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WgLcl_Upd01オペレーション.<p>
	 *
	 * ＷＧマスタの登録を行います。（ロケール用）<br>
	 */
	public class WgLcl_Upd01 extends MABCL_MultiReg_MC_A.WgLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Wg_DelChk01オペレーション.<p>
	 *
	 * ＷＧマスタの削除前のチェックを行います。<br>
	 */
	public class Wg_DelChk01 extends MABCL_MultiReg_MC_A.Wg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Wg_Del01オペレーション.<p>
	 *
	 * ＷＧマスタの削除を行います。<br>
	 */
	public class Wg_Del01 extends MABCL_MultiReg_MC_A.Wg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Oper_UpdChk01オペレーション.<p>
	 *
	 * 工程マスタの登録前のチェックを行います。<br>
	 */
	public class Oper_UpdChk01 extends MABCL_MultiReg_MC_A.Oper_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Oper_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.oper_cd())){
					msgList.add(new MCMessage(row, Oper_UpdChk01_DtlR.$oper_cd, MABCL0306, 
									getLabel(row, Oper_UpdChk01_DtlR.$oper_cd), row.oper_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Oper_Upd01オペレーション.<p>
	 *
	 * 工程マスタの登録を行います。<br>
	 */
	public class Oper_Upd01 extends MABCL_MultiReg_MC_A.Oper_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * OperLcl_UpdChk01オペレーション.<p>
	 *
	 * 工程マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class OperLcl_UpdChk01 extends MABCL_MultiReg_MC_A.OperLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * OperLcl_Upd01オペレーション.<p>
	 *
	 * 工程マスタの登録を行います。（ロケール用）<br>
	 */
	public class OperLcl_Upd01 extends MABCL_MultiReg_MC_A.OperLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Oper_DelChk01オペレーション.<p>
	 *
	 * 工程マスタの削除前のチェックを行います。<br>
	 */
	public class Oper_DelChk01 extends MABCL_MultiReg_MC_A.Oper_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Oper_Del01オペレーション.<p>
	 *
	 * 工程マスタの削除を行います。<br>
	 */
	public class Oper_Del01 extends MABCL_MultiReg_MC_A.Oper_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkCost_UpdChk01オペレーション.<p>
	 *
	 * 工数管理マスタの登録前のチェックを行います。<br>
	 */
	public class WkCost_UpdChk01 extends MABCL_MultiReg_MC_A.WkCost_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(WkCost_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.wk_cost_cd())){
					msgList.add(new MCMessage(row, WkCost_UpdChk01_DtlR.$wk_cost_cd, MABCL0306, 
									getLabel(row, WkCost_UpdChk01_DtlR.$wk_cost_cd), row.wk_cost_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * WkCost_Upd01オペレーション.<p>
	 *
	 * 工数管理マスタの登録を行います。<br>
	 */
	public class WkCost_Upd01 extends MABCL_MultiReg_MC_A.WkCost_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkCostLcl_UpdChk01オペレーション.<p>
	 *
	 * 工数管理マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class WkCostLcl_UpdChk01 extends MABCL_MultiReg_MC_A.WkCostLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkCostLcl_Upd01オペレーション.<p>
	 *
	 * 工数管理マスタの登録を行います。（ロケール用）<br>
	 */
	public class WkCostLcl_Upd01 extends MABCL_MultiReg_MC_A.WkCostLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkCost_DelChk01オペレーション.<p>
	 *
	 * 工数管理マスタの削除前のチェックを行います。<br>
	 */
	public class WkCost_DelChk01 extends MABCL_MultiReg_MC_A.WkCost_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkCost_Del01オペレーション.<p>
	 *
	 * 工数管理マスタの削除を行います。<br>
	 */
	public class WkCost_Del01 extends MABCL_MultiReg_MC_A.WkCost_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkRsn_UpdChk01オペレーション.<p>
	 *
	 * 工数理由マスタの登録前のチェックを行います。<br>
	 */
	public class WkRsn_UpdChk01 extends MABCL_MultiReg_MC_A.WkRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(WkRsn_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.wk_rsn_cd())){
					msgList.add(new MCMessage(row, WkRsn_UpdChk01_DtlR.$wk_rsn_cd, MABCL0306, 
									getLabel(row, WkRsn_UpdChk01_DtlR.$wk_rsn_cd), row.wk_rsn_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * WkRsn_Upd01オペレーション.<p>
	 *
	 * 工数理由マスタの登録を行います。<br>
	 */
	public class WkRsn_Upd01 extends MABCL_MultiReg_MC_A.WkRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkRsnLcl_UpdChk01オペレーション.<p>
	 *
	 * 工数理由マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class WkRsnLcl_UpdChk01 extends MABCL_MultiReg_MC_A.WkRsnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkRsnLcl_Upd01オペレーション.<p>
	 *
	 * 工数理由マスタの登録を行います。（ロケール用）<br>
	 */
	public class WkRsnLcl_Upd01 extends MABCL_MultiReg_MC_A.WkRsnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkRsn_DelChk01オペレーション.<p>
	 *
	 * 工数理由マスタの削除前のチェックを行います。<br>
	 */
	public class WkRsn_DelChk01 extends MABCL_MultiReg_MC_A.WkRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkRsn_Del01オペレーション.<p>
	 *
	 * 工数理由マスタの削除を行います。<br>
	 */
	public class WkRsn_Del01 extends MABCL_MultiReg_MC_A.WkRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriGrp_UpdChk01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録前のチェックを行います。<br>
	 */
	public class SlsUpriGrp_UpdChk01 extends MABCL_MultiReg_MC_A.SlsUpriGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SlsUpriGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.sls_upri_grp_cd())){
					msgList.add(new MCMessage(row, SlsUpriGrp_UpdChk01_DtlR.$sls_upri_grp_cd, MABCL0306, 
									getLabel(row, SlsUpriGrp_UpdChk01_DtlR.$sls_upri_grp_cd), row.sls_upri_grp_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * SlsUpriGrp_Upd01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録を行います。<br>
	 */
	public class SlsUpriGrp_Upd01 extends MABCL_MultiReg_MC_A.SlsUpriGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class SlsUpriGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.SlsUpriGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriGrpLcl_Upd01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録を行います。（ロケール用）<br>
	 */
	public class SlsUpriGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.SlsUpriGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriGrp_DelChk01オペレーション.<p>
	 *
	 * 販売単価分類マスタの削除前のチェックを行います。<br>
	 */
	public class SlsUpriGrp_DelChk01 extends MABCL_MultiReg_MC_A.SlsUpriGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriGrp_Del01オペレーション.<p>
	 *
	 * 販売単価分類マスタの削除を行います。<br>
	 */
	public class SlsUpriGrp_Del01 extends MABCL_MultiReg_MC_A.SlsUpriGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriRank_UpdChk01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録前のチェックを行います。<br>
	 */
	public class SlsUpriRank_UpdChk01 extends MABCL_MultiReg_MC_A.SlsUpriRank_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SlsUpriRank_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.sls_upri_rank_cd())){
					msgList.add(new MCMessage(row, SlsUpriRank_UpdChk01_DtlR.$sls_upri_rank_cd, MABCL0306, 
									getLabel(row, SlsUpriRank_UpdChk01_DtlR.$sls_upri_rank_cd), row.sls_upri_rank_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * SlsUpriRank_Upd01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録を行います。<br>
	 */
	public class SlsUpriRank_Upd01 extends MABCL_MultiReg_MC_A.SlsUpriRank_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriRankLcl_UpdChk01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class SlsUpriRankLcl_UpdChk01 extends MABCL_MultiReg_MC_A.SlsUpriRankLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriRankLcl_Upd01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録を行います。（ロケール用）<br>
	 */
	public class SlsUpriRankLcl_Upd01 extends MABCL_MultiReg_MC_A.SlsUpriRankLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriRank_DelChk01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの削除前のチェックを行います。<br>
	 */
	public class SlsUpriRank_DelChk01 extends MABCL_MultiReg_MC_A.SlsUpriRank_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsUpriRank_Del01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの削除を行います。<br>
	 */
	public class SlsUpriRank_Del01 extends MABCL_MultiReg_MC_A.SlsUpriRank_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetoffGrp_UpdChk01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録前のチェックを行います。<br>
	 */
	public class SetoffGrp_UpdChk01 extends MABCL_MultiReg_MC_A.SetoffGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SetoffGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.setoff_grp_cd())){
					msgList.add(new MCMessage(row, SetoffGrp_UpdChk01_DtlR.$setoff_grp_cd, MABCL0306, 
									getLabel(row, SetoffGrp_UpdChk01_DtlR.$setoff_grp_cd), row.setoff_grp_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * SetoffGrp_Upd01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録を行います。<br>
	 */
	public class SetoffGrp_Upd01 extends MABCL_MultiReg_MC_A.SetoffGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetoffGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class SetoffGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.SetoffGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetoffGrpLcl_Upd01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class SetoffGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.SetoffGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetoffGrp_DelChk01オペレーション.<p>
	 *
	 * 相殺グループマスタの削除前のチェックを行います。<br>
	 */
	public class SetoffGrp_DelChk01 extends MABCL_MultiReg_MC_A.SetoffGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetoffGrp_Del01オペレーション.<p>
	 *
	 * 相殺グループマスタの削除を行います。<br>
	 */
	public class SetoffGrp_Del01 extends MABCL_MultiReg_MC_A.SetoffGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipValid_UpdChk01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録前のチェックを行います。<br>
	 */
	public class ShipValid_UpdChk01 extends MABCL_MultiReg_MC_A.ShipValid_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ShipValid_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ship_valid_grp_cd())){
					msgList.add(new MCMessage(row, ShipValid_UpdChk01_DtlR.$ship_valid_grp_cd, MABCL0306, 
									getLabel(row, ShipValid_UpdChk01_DtlR.$ship_valid_grp_cd), row.ship_valid_grp_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * ShipValid_Upd01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録を行います。<br>
	 */
	public class ShipValid_Upd01 extends MABCL_MultiReg_MC_A.ShipValid_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipValidLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ShipValidLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ShipValidLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipValidLcl_Upd01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class ShipValidLcl_Upd01 extends MABCL_MultiReg_MC_A.ShipValidLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipValid_DelChk01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの削除前のチェックを行います。<br>
	 */
	public class ShipValid_DelChk01 extends MABCL_MultiReg_MC_A.ShipValid_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipValid_Del01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの削除を行います。<br>
	 */
	public class ShipValid_Del01 extends MABCL_MultiReg_MC_A.ShipValid_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmShipGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録前のチェックを行います。<br>
	 */
	public class ItmShipGrp_UpdChk01 extends MABCL_MultiReg_MC_A.ItmShipGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmShipGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.itm_ship_grp_cd())){
					msgList.add(new MCMessage(row, ItmShipGrp_UpdChk01_DtlR.$itm_ship_grp_cd, MABCL0306, 
									getLabel(row, ItmShipGrp_UpdChk01_DtlR.$itm_ship_grp_cd), row.itm_ship_grp_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * ItmShipGrp_Upd01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録を行います。<br>
	 */
	public class ItmShipGrp_Upd01 extends MABCL_MultiReg_MC_A.ItmShipGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmShipGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ItmShipGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ItmShipGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmShipGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class ItmShipGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.ItmShipGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmShipGrp_DelChk01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの削除前のチェックを行います。<br>
	 */
	public class ItmShipGrp_DelChk01 extends MABCL_MultiReg_MC_A.ItmShipGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmShipGrp_Del01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの削除を行います。<br>
	 */
	public class ItmShipGrp_Del01 extends MABCL_MultiReg_MC_A.ItmShipGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Trnspt_UpdChk01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録前のチェックを行います。<br>
	 */
	public class Trnspt_UpdChk01 extends MABCL_MultiReg_MC_A.Trnspt_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Trnspt_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.trnspt_cd())){
					msgList.add(new MCMessage(row, Trnspt_UpdChk01_DtlR.$trnspt_cd, MABCL0306, 
									getLabel(row, Trnspt_UpdChk01_DtlR.$trnspt_cd), row.trnspt_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Trnspt_Upd01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録を行います。<br>
	 */
	public class Trnspt_Upd01 extends MABCL_MultiReg_MC_A.Trnspt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * TrnsptLcl_UpdChk01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class TrnsptLcl_UpdChk01 extends MABCL_MultiReg_MC_A.TrnsptLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * TrnsptLcl_Upd01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録を行います。（ロケール用）<br>
	 */
	public class TrnsptLcl_Upd01 extends MABCL_MultiReg_MC_A.TrnsptLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Trnspt_DelChk01オペレーション.<p>
	 *
	 * 輸送方法マスタの削除前のチェックを行います。<br>
	 */
	public class Trnspt_DelChk01 extends MABCL_MultiReg_MC_A.Trnspt_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Trnspt_Del01オペレーション.<p>
	 *
	 * 輸送方法マスタの削除を行います。<br>
	 */
	public class Trnspt_Del01 extends MABCL_MultiReg_MC_A.Trnspt_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}