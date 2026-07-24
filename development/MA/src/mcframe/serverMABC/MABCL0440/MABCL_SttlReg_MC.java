package mcframe.serverMABC.MABCL0440;

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
import mcframe.serverMABC.MABCL0440.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SttlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SttlReg_MC extends MABCL_SttlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Sttl_UpdChk01オペレーション.<p>
	 *
	 * 決済方法マスタを登録する前のチェック処理を行います。<br>
	 */
	public class Sttl_UpdChk01 extends MABCL_SttlReg_MC_A.Sttl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			for (Sttl_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.sttl_cd())){
					msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$sttl_cd, MABCL0306, 
									getLabel(r, Sttl_UpdChk01_DtlR.$sttl_cd), r.sttl_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (r.ar_sttl_flg()) {
					msgList.addAll(check(r, Sttl_UpdChk01_DtlR.$ar_sttl_typ, new FXUCL_RequiredValidater()));
				}
				if (MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())
				 || MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())
				 || MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ())) {
					msgList.addAll(check(r, Sttl_UpdChk01_DtlR.$rcv_reg_typ, new FXUCL_RequiredValidater()));
				}
				if (r.calc_com_paid_flg()) {
					msgList.addAll(check(r, Sttl_UpdChk01_DtlR.$ar_setoff_cd, new FXUCL_RequiredValidater()));
				}
				if (r.ap_sttl_flg()) {
					msgList.addAll(check(r, Sttl_UpdChk01_DtlR.$ap_sttl_typ, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!r.ar_sttl_flg()) {
					if (!isNull(r.ar_sttl_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ar_sttl_typ, MABCL0157, toDispGUIIndex(r)));
					}
				}
				if (!MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())
				 && !MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())
				 && !MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ())) {
					if (!isNull(r.rcv_reg_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$rcv_reg_typ, MABCL0158, toDispGUIIndex(r)));
					}
					if (r.calc_com_paid_flg()) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$calc_com_paid_flg, MABCL0161, toDispGUIIndex(r)));
					}
					if (!isNull(r.ar_setoff_cd())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ar_setoff_cd, MABCL0162, toDispGUIIndex(r)));
					}
				}
				 
				if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ())) {
					if (!MAC_AR_STTL_TYP.isSETOFF_CR(r.ar_sttl_typ())) {
						if (!isNull(r.debt_cred_id_typ())) {
							msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$debt_cred_id_typ, MABCL0163, toDispGUIIndex(r)));
						}
					}
					if (!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
						if (!isNull(r.sls_purc_typ())) {
							msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$sls_purc_typ, MABCL0160, toDispGUIIndex(r)));
						}
					}
				}
				
				if (!isNull(r.ac_rsn_cd())) {
					if (MAC_AR_STTL_TYP.isSW(r.ar_sttl_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ar_sttl_typ, MABCL0159, toDispGUIIndex(r)));
					}
					if (MAC_AP_STTL_TYP.isAPSW_IN_CHK(r.ap_sttl_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ap_sttl_typ, MABCL0532, toDispGUIIndex(r)));
					}
					if (MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(r.ap_sttl_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ap_sttl_typ, MABCL0533, toDispGUIIndex(r)));
					}
				}
				
				if (!r.ap_sttl_flg()) {
					if (!isNull(r.ap_sttl_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ap_sttl_typ, MABCL0164, toDispGUIIndex(r)));
					}
				}
				if (!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
					if (!isNull(r.ap_setoff_typ())) {
						msgList.add(new MCMessage(r, Sttl_UpdChk01_DtlR.$ap_setoff_typ, MABCL0165, toDispGUIIndex(r)));
					}
				}
			}

			return msgList;
		}
	}
	/**
	 * Sttl_Upd01オペレーション.<p>
	 *
	 * 決済方法マスタの登録処理を行います。<br>
	 */
	public class Sttl_Upd01 extends MABCL_SttlReg_MC_A.Sttl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);
			for (R r : dbc) {
				if (r instanceof MAM_STTL_R) {
					MAM_STTL_R row = (MAM_STTL_R) r;

					// 一件チェック（債権決済区分=6：源泉税）
					if (MAC_AR_STTL_TYP.isWTAX(row.ar_sttl_typ())) {
						checkArSttlTyp(row, MABCL0279);
					}
					// 一件チェック（債権決済区分=7：振替）
					else if (MAC_AR_STTL_TYP.isSW(row.ar_sttl_typ())) {
						checkArSttlTyp(row, MABCL0280);
					}
					
					// 一件チェック（債務決済区分=B：照合済残高振替受入）
					if (MAC_AP_STTL_TYP.isAPSW_IN_CHK(row.ap_sttl_typ())) {
						checkApSttlTyp(row, MABCL0534);
					}
					// 一件チェック（債務決済区分=D：未照合残高振替受入）
					else if (MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(row.ap_sttl_typ())) {
						checkApSttlTyp(row, MABCL0535);
					}
				}
			}
		}

		/**
		 * 債権決済区分「6：源泉税」「7：振替」はそれぞれ1件のみチェック
		 */
		protected void checkArSttlTyp(MAM_STTL_R r, String id) {

			if (r.del_flg()) {
				return;
			}
			MAM_STTL_R t = MAM_STTL_R.create("T");
			int i = execDbCount("MABCL0440_MAM_STTL_S01", t,
					t.ar_sttl_typ.eq(bind("ar_sttl_typ"))
					.and(t.sttl_cd.neq(bind("sttl_cd")))
					.and(t.del_flg.eq(value(false))),
					r);
			
			if (i > 0) {
				getMsgList().add(
						new MCMessage(r, MAM_STTL_R.$ar_sttl_typ, id, toDispGUIIndex(r)));
			}
		}
		
		/**
		 * 債務決済区分のそれぞれ1件のみチェック
		 */
		protected void checkApSttlTyp(MAM_STTL_R r, String id) {
			if (r.del_flg()) {
				return;
			}

			MAM_STTL_R t = MAM_STTL_R.create("T");
			int i = execDbCount("MABCL0440_MAM_STTL_S02", t,
					t.ap_sttl_typ.eq(bind("ap_sttl_typ"))
					.and(t.sttl_cd.neq(bind("sttl_cd")))
					.and(t.del_flg.eq(value(false))), r);

			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_STTL_R.$ap_sttl_typ, id, toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * SttlLcl_UpdChk01オペレーション.<p>
	 *
	 * 決済方法マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class SttlLcl_UpdChk01 extends MABCL_SttlReg_MC_A.SttlLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SttlLcl_Upd01オペレーション.<p>
	 *
	 * 決済方法マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class SttlLcl_Upd01 extends MABCL_SttlReg_MC_A.SttlLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Sttl_DelChk01オペレーション.<p>
	 *
	 * 決済方法マスタ、決済方法マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class Sttl_DelChk01 extends MABCL_SttlReg_MC_A.Sttl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Sttl_Del01オペレーション.<p>
	 *
	 * 決済方法マスタ、決済方法マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Sttl_Del01 extends MABCL_SttlReg_MC_A.Sttl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 決済方法マスタ、決済方法マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SttlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_STTL_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_STTL_R sttl = MAM_STTL_R.create("STTL");
			MAM_STTL_R t = MAM_STTL_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(sttl, t.ar_setoff_cd.eq(sttl.sttl_cd));
			builder.addSelect(sttl.sttl_nm.as("ar_setoff_nm"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 決済方法マスタ、決済方法マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_SttlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 決済方法マスタ、決済方法マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABCL_SttlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}