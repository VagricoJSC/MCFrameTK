package mcframe.serverMABC.MABCL0034;

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
import mcframe.serverMABC.MABCL0034.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ExCntnr_UpdChk01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録前のチェックを行います。<br>
	 */
	public class ExCntnr_UpdChk01 extends MABCL_MultiReg_MC_A.ExCntnr_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ExCntnr_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.cntnr_cd())){
					msgList.add(new MCMessage(row, ExCntnr_UpdChk01_DtlR.$cntnr_cd, MABCL0306, 
									getLabel(row, ExCntnr_UpdChk01_DtlR.$cntnr_cd), row.cntnr_cd(), toDispGUIIndex(row)));
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
	 * ExCntnr_Upd01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録を行います。<br>
	 */
	public class ExCntnr_Upd01 extends MABCL_MultiReg_MC_A.ExCntnr_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExCntnrLcl_UpdChk01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ExCntnrLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ExCntnrLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExCntnrLcl_Upd01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録を行います。（ロケール用）<br>
	 */
	public class ExCntnrLcl_Upd01 extends MABCL_MultiReg_MC_A.ExCntnrLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExCntnr_DelChk01オペレーション.<p>
	 *
	 * 梱包容器マスタの削除前のチェックを行います。<br>
	 */
	public class ExCntnr_DelChk01 extends MABCL_MultiReg_MC_A.ExCntnr_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExCntnr_Del01オペレーション.<p>
	 *
	 * 梱包容器マスタの削除を行います。<br>
	 */
	public class ExCntnr_Del01 extends MABCL_MultiReg_MC_A.ExCntnr_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * EximPort_UpdChk01オペレーション.<p>
	 *
	 * 港マスタの登録前のチェックを行います。<br>
	 */
	public class EximPort_UpdChk01 extends MABCL_MultiReg_MC_A.EximPort_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(EximPort_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.port_cd())){
					msgList.add(new MCMessage(row, EximPort_UpdChk01_DtlR.$port_cd, MABCL0306, 
									getLabel(row, EximPort_UpdChk01_DtlR.$port_cd), row.port_cd(), toDispGUIIndex(row)));
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
	 * EximPort_Upd01オペレーション.<p>
	 *
	 * 港マスタの登録を行います。<br>
	 */
	public class EximPort_Upd01 extends MABCL_MultiReg_MC_A.EximPort_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * EximPortLcl_UpdChk01オペレーション.<p>
	 *
	 * 港マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class EximPortLcl_UpdChk01 extends MABCL_MultiReg_MC_A.EximPortLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * EximPortLcl_Upd01オペレーション.<p>
	 *
	 * 港マスタの登録を行います。（ロケール用）<br>
	 */
	public class EximPortLcl_Upd01 extends MABCL_MultiReg_MC_A.EximPortLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * EximPort_DelChk01オペレーション.<p>
	 *
	 * 港マスタの削除前のチェックを行います。<br>
	 */
	public class EximPort_DelChk01 extends MABCL_MultiReg_MC_A.EximPort_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * EximPort_Del01オペレーション.<p>
	 *
	 * 港マスタの削除を行います。<br>
	 */
	public class EximPort_Del01 extends MABCL_MultiReg_MC_A.EximPort_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkGd_UpdChk01オペレーション.<p>
	 *
	 * 格付マスタの登録前のチェックを行います。<br>
	 */
	public class StkGd_UpdChk01 extends MABCL_MultiReg_MC_A.StkGd_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(StkGd_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.gd_cd()) || isSame(row.gd_cd(), "**")) {
					msgList.add(new MCMessage(row, StkGd_UpdChk01_DtlR.$gd_cd, MABCL0306, 
									getLabel(row, StkGd_UpdChk01_DtlR.$gd_cd), row.gd_cd(), toDispGUIIndex(row)));
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
	 * StkGd_Upd01オペレーション.<p>
	 *
	 * 格付マスタの登録を行います。<br>
	 */
	public class StkGd_Upd01 extends MABCL_MultiReg_MC_A.StkGd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkGdLcl_UpdChk01オペレーション.<p>
	 *
	 * 格付マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class StkGdLcl_UpdChk01 extends MABCL_MultiReg_MC_A.StkGdLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkGdLcl_Upd01オペレーション.<p>
	 *
	 * 格付マスタの登録を行います。（ロケール用）<br>
	 */
	public class StkGdLcl_Upd01 extends MABCL_MultiReg_MC_A.StkGdLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkGd_DelChk01オペレーション.<p>
	 *
	 * 格付マスタの削除前のチェックを行います。<br>
	 */
	public class StkGd_DelChk01 extends MABCL_MultiReg_MC_A.StkGd_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkGd_Del01オペレーション.<p>
	 *
	 * 格付マスタの削除を行います。<br>
	 */
	public class StkGd_Del01 extends MABCL_MultiReg_MC_A.StkGd_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Trd_UpdChk01オペレーション.<p>
	 *
	 * 取引マスタの登録前のチェックを行います。<br>
	 */
	public class Trd_UpdChk01 extends MABCL_MultiReg_MC_A.Trd_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Trd_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.trd_cd())){
					msgList.add(new MCMessage(row, Trd_UpdChk01_DtlR.$trd_cd, MABCL0306, 
									getLabel(row, Trd_UpdChk01_DtlR.$trd_cd), row.trd_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				MAC_TRD_PTN_TYP typ = MAC_TRD_PTN_TYP.get(row.trd_ptn_typ());
				if (typ.is_ac_rsn_req() && !MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(row.trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(row.trd_ptn_typ())) {
					msgList.addAll(check(row, Trd_UpdChk01_DtlR.$ac_rsn_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!typ.is_ac_rsn_req()) {
					if (!isNull(row.ac_rsn_cd())) {
						msgList.add(getMsg(row, Trd_UpdChk01_DtlR.$ac_rsn_cd, MABCL0286));
					}
				}
				if (!typ.is_lot_slip_set()) {
					if (!isNull(row.slip_each_lot_typ())) {
						msgList.add(getMsg(row, Trd_UpdChk01_DtlR.$slip_each_lot_typ, MABCL0286));
					}
				}
				if (!typ.is_slip_form_set()) {
					if (!isNull(row.slip_form_cd())) {
						msgList.add(getMsg(row, Trd_UpdChk01_DtlR.$slip_form_cd, MABCL0286));
					}
				}
			}
			return msgList;
		}

		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(Trd_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
	}
	/**
	 * Trd_Upd01オペレーション.<p>
	 *
	 * 取引マスタの登録を行います。<br>
	 */
	public class Trd_Upd01 extends MABCL_MultiReg_MC_A.Trd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_TRD_R) {
					checkAutoAdoptFlg((MAM_TRD_R) r);
				}
			}
		}

		/**
		 * 同一取引パタン区分で自動時採用は1件のみオンチェック
		 */
		protected void checkAutoAdoptFlg(MAM_TRD_R r) {
			if (!r.auto_adopt_flg() || r.del_flg()) {
				return;
			}

			MAM_TRD_R t = MAM_TRD_R.create("T");
			int i = execDbCount("MABCL0034_MAM_TRD_S01", t,
					t.trd_cd.neq(bind("trd_cd"))
							.and(t.trd_ptn_typ.eq(bind("trd_ptn_typ")))
							.and(t.auto_adopt_flg.eq(value(true)))
							.and(t.del_flg.eq(value(false))),
					r);

			if (i > 0) {
				getMsgList().add(new MCMessage(r, Trd_UpdChk01_DtlR.$auto_adopt_flg,
						MABCL0287, r.trd_ptn_typ(), toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * TrdLcl_UpdChk01オペレーション.<p>
	 *
	 * 取引マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class TrdLcl_UpdChk01 extends MABCL_MultiReg_MC_A.TrdLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * TrdLcl_Upd01オペレーション.<p>
	 *
	 * 取引マスタの登録を行います。（ロケール用）<br>
	 */
	public class TrdLcl_Upd01 extends MABCL_MultiReg_MC_A.TrdLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Trd_DelChk01オペレーション.<p>
	 *
	 * 取引マスタの削除前のチェックを行います。<br>
	 */
	public class Trd_DelChk01 extends MABCL_MultiReg_MC_A.Trd_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Trd_Del01オペレーション.<p>
	 *
	 * 取引マスタの削除を行います。<br>
	 */
	public class Trd_Del01 extends MABCL_MultiReg_MC_A.Trd_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlipForm_UpdChk01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録前のチェックを行います。<br>
	 */
	public class SlipForm_UpdChk01 extends MABCL_MultiReg_MC_A.SlipForm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SlipForm_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.slip_form_cd())){
					msgList.add(new MCMessage(row, SlipForm_UpdChk01_DtlR.$slip_form_cd, MABCL0306, 
									getLabel(row, SlipForm_UpdChk01_DtlR.$slip_form_cd), row.slip_form_cd(), toDispGUIIndex(row)));
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
	 * SlipForm_Upd01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録を行います。<br>
	 */
	public class SlipForm_Upd01 extends MABCL_MultiReg_MC_A.SlipForm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlipFormLcl_UpdChk01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class SlipFormLcl_UpdChk01 extends MABCL_MultiReg_MC_A.SlipFormLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlipFormLcl_Upd01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録を行います。（ロケール用）<br>
	 */
	public class SlipFormLcl_Upd01 extends MABCL_MultiReg_MC_A.SlipFormLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlipForm_DelChk01オペレーション.<p>
	 *
	 * 伝票帳票マスタの削除前のチェックを行います。<br>
	 */
	public class SlipForm_DelChk01 extends MABCL_MultiReg_MC_A.SlipForm_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlipForm_Del01オペレーション.<p>
	 *
	 * 伝票帳票マスタの削除を行います。<br>
	 */
	public class SlipForm_Del01 extends MABCL_MultiReg_MC_A.SlipForm_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PfGrp_UpdChk01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録前のチェックを行います。<br>
	 */
	public class PfGrp_UpdChk01 extends MABCL_MultiReg_MC_A.PfGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(PfGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.pf_grp_cd())){
					msgList.add(new MCMessage(row, PfGrp_UpdChk01_DtlR.$pf_grp_cd, MABCL0306, 
									getLabel(row, PfGrp_UpdChk01_DtlR.$pf_grp_cd), row.pf_grp_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 週次内示期間
				MCNumber weeklyNum = row.weekly_period_num();
				// 週次開始位置
				MCNumber weeklySt = row.weekly_period_st();
				// 旬次内示期間
				MCNumber tendaysNum = row.tendays_period_num();
				// 旬次開始位置
				MCNumber tendaysSt = row.tendays_period_st();
				// 月次内示期間
				MCNumber monthlyNum = row.monthly_period_num();
				// 月次開始位置
				MCNumber monthlySt = row.monthly_period_st();
				
				if ((weeklyNum.add(tendaysNum).add(monthlyNum)).eq(0)) {
					MCMessage msg = new MCMessage(row, null, MABCL0284, toDispGUIIndex(row));
					msgList.add(msg);
				}
				if (weeklyNum.add(weeklySt).gt(16)) {
					MCMessage msg = new MCMessage(row, null, MABCL0281, toDispGUIIndex(row));
					msgList.add(msg);
				}
				if (tendaysNum.add(tendaysSt).gt(10)) {
					MCMessage msg = new MCMessage(row, null, MABCL0282, toDispGUIIndex(row));
					msgList.add(msg);
				}
				if (monthlyNum.add(monthlySt).gt(13)) {
					MCMessage msg = new MCMessage(row, null, MABCL0283, toDispGUIIndex(row));
					msgList.add(msg);
				}
			}
			return msgList;
		}
	}
	/**
	 * PfGrp_Upd01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録を行います。<br>
	 */
	public class PfGrp_Upd01 extends MABCL_MultiReg_MC_A.PfGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PfGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class PfGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.PfGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PfGrpLcl_Upd01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class PfGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.PfGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PfGrp_DelChk01オペレーション.<p>
	 *
	 * 購買内示グループマスタの削除前のチェックを行います。<br>
	 */
	public class PfGrp_DelChk01 extends MABCL_MultiReg_MC_A.PfGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PfGrp_Del01オペレーション.<p>
	 *
	 * 購買内示グループマスタの削除を行います。<br>
	 */
	public class PfGrp_Del01 extends MABCL_MultiReg_MC_A.PfGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSpecGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録前のチェックを行います。<br>
	 */
	public class ItmSpecGrp_UpdChk01 extends MABCL_MultiReg_MC_A.ItmSpecGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmSpecGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.itm_spec_grp_cd())){
					msgList.add(new MCMessage(row, ItmSpecGrp_UpdChk01_DtlR.$itm_spec_grp_cd, MABCL0306, 
									getLabel(row, ItmSpecGrp_UpdChk01_DtlR.$itm_spec_grp_cd), row.itm_spec_grp_cd(), toDispGUIIndex(row)));
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
	 * ItmSpecGrp_Upd01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録を行います。<br>
	 */
	public class ItmSpecGrp_Upd01 extends MABCL_MultiReg_MC_A.ItmSpecGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSpecGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ItmSpecGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ItmSpecGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSpecGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録を行います。（ロケール用）<br>
	 */
	public class ItmSpecGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.ItmSpecGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSpecGrp_DelChk01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの削除前のチェックを行います。<br>
	 */
	public class ItmSpecGrp_DelChk01 extends MABCL_MultiReg_MC_A.ItmSpecGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSpecGrp_Del01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの削除を行います。<br>
	 */
	public class ItmSpecGrp_Del01 extends MABCL_MultiReg_MC_A.ItmSpecGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmCompGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録前のチェックを行います。<br>
	 */
	public class ItmCompGrp_UpdChk01 extends MABCL_MultiReg_MC_A.ItmCompGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmCompGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.itm_comp_grp_cd())){
					msgList.add(new MCMessage(row, ItmCompGrp_UpdChk01_DtlR.$itm_comp_grp_cd, MABCL0306, 
									getLabel(row, ItmCompGrp_UpdChk01_DtlR.$itm_comp_grp_cd), row.itm_comp_grp_cd(), toDispGUIIndex(row)));
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
	 * ItmCompGrp_Upd01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録を行います。<br>
	 */
	public class ItmCompGrp_Upd01 extends MABCL_MultiReg_MC_A.ItmCompGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmCompGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ItmCompGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ItmCompGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmCompGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class ItmCompGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.ItmCompGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmCompGrp_DelChk01オペレーション.<p>
	 *
	 * 品目構成グループマスタの削除前のチェックを行います。<br>
	 */
	public class ItmCompGrp_DelChk01 extends MABCL_MultiReg_MC_A.ItmCompGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmCompGrp_Del01オペレーション.<p>
	 *
	 * 品目構成グループマスタの削除を行います。<br>
	 */
	public class ItmCompGrp_Del01 extends MABCL_MultiReg_MC_A.ItmCompGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlAct_UpdChk01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録前のチェックを行います。<br>
	 */
	public class JnlAct_UpdChk01 extends MABCL_MultiReg_MC_A.JnlAct_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(JnlAct_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.jnl_act_cd())){
					msgList.add(new MCMessage(row, JnlAct_UpdChk01_DtlR.$jnl_act_cd, MABCL0306, 
									getLabel(row, JnlAct_UpdChk01_DtlR.$jnl_act_cd), row.jnl_act_cd(), toDispGUIIndex(row)));
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
	 * JnlAct_Upd01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録を行います。<br>
	 */
	public class JnlAct_Upd01 extends MABCL_MultiReg_MC_A.JnlAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlActLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class JnlActLcl_UpdChk01 extends MABCL_MultiReg_MC_A.JnlActLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlActLcl_Upd01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録を行います。（ロケール用）<br>
	 */
	public class JnlActLcl_Upd01 extends MABCL_MultiReg_MC_A.JnlActLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlAct_DelChk01オペレーション.<p>
	 *
	 * 仕訳実行マスタの削除前のチェックを行います。<br>
	 */
	public class JnlAct_DelChk01 extends MABCL_MultiReg_MC_A.JnlAct_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlAct_Del01オペレーション.<p>
	 *
	 * 仕訳実行マスタの削除を行います。<br>
	 */
	public class JnlAct_Del01 extends MABCL_MultiReg_MC_A.JnlAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlGrp_UpdChk01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録前のチェックを行います。<br>
	 */
	public class JnlGrp_UpdChk01 extends MABCL_MultiReg_MC_A.JnlGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(JnlGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.jnl_grp_cd())){
					msgList.add(new MCMessage(row, JnlGrp_UpdChk01_DtlR.$jnl_grp_cd, MABCL0306, 
									getLabel(row, JnlGrp_UpdChk01_DtlR.$jnl_grp_cd), row.jnl_grp_cd(), toDispGUIIndex(row)));
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
	 * JnlGrp_Upd01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録を行います。<br>
	 */
	public class JnlGrp_Upd01 extends MABCL_MultiReg_MC_A.JnlGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_JNL_GRP_R) {
					MAM_JNL_GRP_R row = (MAM_JNL_GRP_R) r;

					// 一件チェック（口座科目設定マスタ取込ＦＬＧ１）
					if (row.ac_bank_flg1()) {
						checkFlg(row, MABCL0047);
					}
					// 一件チェック（口座科目設定マスタ取込ＦＬＧ２）
					if (row.ac_bank_flg2()) {
						checkFlg(row, MABCL0233);
					}
				}
			}
		}

		/**
		 * 口座科目設定マスタ取込ＦＬＧ１＝オン、口座科目設定マスタ取込ＦＬＧ２＝オンはそれぞれ1件のみチェック
		 */
		protected void checkFlg(MAM_JNL_GRP_R r, String id) {
			if (r.del_flg()) {
				return;
			}

			MAM_JNL_GRP_R t = MAM_JNL_GRP_R.create("T");
			int i = 0;
			if (isSame(id, MABCL0047)) {
				i = execDbCount("MABCL0034_MAM_JNL_GRP_S01", t,
						t.jnl_grp_cd.neq(bind("jnl_grp_cd"))
								.and(t.del_flg.eq(value(false)))
								.and(t.ac_bank_flg1.eq(value(true))),
						r);
			}
			else {
				i = execDbCount("MABCL0034_MAM_JNL_GRP_S02", t,
						t.jnl_grp_cd.neq(bind("jnl_grp_cd"))
								.and(t.del_flg.eq(value(false)))
								.and(t.ac_bank_flg2.eq(value(true))),
						r);
			}

			if (i > 0) {
				getMsgList()
						.add(new MCMessage(r,
								isSame(id, MABCL0047) ? MAM_JNL_GRP_R.$ac_bank_flg1
										: MAM_JNL_GRP_R.$ac_bank_flg2,
								id, toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * JnlGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class JnlGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.JnlGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlGrpLcl_Upd01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class JnlGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.JnlGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlGrp_DelChk01オペレーション.<p>
	 *
	 * 仕訳グループマスタの削除前のチェックを行います。<br>
	 */
	public class JnlGrp_DelChk01 extends MABCL_MultiReg_MC_A.JnlGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlGrp_Del01オペレーション.<p>
	 *
	 * 仕訳グループマスタの削除を行います。<br>
	 */
	public class JnlGrp_Del01 extends MABCL_MultiReg_MC_A.JnlGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}