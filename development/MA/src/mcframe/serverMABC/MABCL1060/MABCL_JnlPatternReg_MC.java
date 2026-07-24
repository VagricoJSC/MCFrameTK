package mcframe.serverMABC.MABCL1060;

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
import mcframe.serverMABC.MABCL1060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_JnlPatternReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_JnlPatternReg_MC extends MABCL_JnlPatternReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * JnlPtn_DelChk01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの削除前のチェックを行います。<br>
	 */
	public class JnlPtn_DelChk01 extends MABCL_JnlPatternReg_MC_A.JnlPtn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlPtn_Del01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの削除を行います。<br>
	 */
	public class JnlPtn_Del01 extends MABCL_JnlPatternReg_MC_A.JnlPtn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_JnlPatternReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);

			cond.addDateColumn("base_dt", getToday());
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeJnlPtn(builder, rslt);
		}

		protected <R extends MCDBContainer> void dbcCustomizeJnlPtn(MCQueryApiBuilder builder,
			MCList<R> result) {
			MAM_AC_DPT_R dpt1 = MAM_AC_DPT_R.create("DPT1");
			MAM_AC_DPT_R dpt2 = MAM_AC_DPT_R.create("DPT2");
			MAM_JNL_PTN_R t = MAM_JNL_PTN_R.create(builder.getBaseDbcAlias());
			MAM_ACCOUNT_R account1 = MAM_ACCOUNT_R.create(MAM_JNL_PTN_R.$ACCOUNT1);
			MAM_ACCOUNT_R account2 = MAM_ACCOUNT_R.create(MAM_JNL_PTN_R.$ACCOUNT2);

			builder.addLeftOuterJoin(dpt1, t.dr_dpt_cd.eq(dpt1.ac_dpt_cd)
					.and(dpt1.st_dt.lte(bind("base_dt")))
					.and(dpt1.end_dt.gte(bind("base_dt"))));
			builder.addLeftOuterJoin(dpt2, t.cr_dpt_cd.eq(dpt2.ac_dpt_cd)
					.and(dpt2.st_dt.lte(bind("base_dt")))
					.and(dpt2.end_dt.gte(bind("base_dt"))));
			builder.addSelect(dpt1.ac_dpt_nm.as("dr_dpt_nm"));
			builder.addSelect(dpt2.ac_dpt_nm.as("cr_dpt_nm"));
			builder.addSelect(account1.sub_flg.as("dr_sub_flg"));
			builder.addSelect(account2.sub_flg.as("cr_sub_flg"));
			builder.addSelect(account1.bp_flg.as("dr_bp_flg"));
			builder.addSelect(account2.bp_flg.as("cr_bp_flg"));
			result.addBooleanColumn(Srch01_Rslt1R.$dr_sub_flg);
			result.addBooleanColumn(Srch01_Rslt1R.$cr_sub_flg);
			result.addBooleanColumn(Srch01_Rslt1R.$dr_bp_flg);
			result.addBooleanColumn(Srch01_Rslt1R.$cr_bp_flg);
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_JnlPatternReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlPtn_UpdChk01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの登録前のチェックを行います。<br>
	 */
	public class JnlPtn_UpdChk01 extends MABCL_JnlPatternReg_MC_A.JnlPtn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (JnlPtn_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				if (!isNull(r.itm_cd()) || !isNull(r.itm_sub1()) 
						|| !isNull(r.itm_sub2()) || !isNull(r.itm_sub3())) {
					if (isNull(r.itm_cd()) || isNull(r.itm_sub1()) 
							|| isNull(r.itm_sub2())|| isNull(r.itm_sub3())) {
						msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$itm_cd, MABCL0322, 
								getLabel(r, JnlPtn_UpdChk01_DtlR.$itm_cd), toDispGUIIndex(r)));
					}
				}

				// 個別チェック
				if (r.dr_sub_flg() && isNull(r.dr_sub_ac_cd())){
					msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$dr_ac_cd, MABCL0005, r.dr_ac_cd(), toDispGUIIndex(r)));
				}
				if (r.cr_sub_flg() && isNull(r.cr_sub_ac_cd())){
					msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$cr_ac_cd, MABCL0005, r.cr_ac_cd(), toDispGUIIndex(r)));
				}

				if (!isNull(r.dr_ac_cd())) {
					if (!r.dr_bp_flg() && !MAC_BP_SET_TYP.isNON(r.dr_bp_typ())) {
						msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$dr_ac_cd, MABCL0008, r.dr_ac_cd(), toDispGUIIndex(r)));
					}
					else if (r.dr_bp_flg() && MAC_BP_SET_TYP.isNON(r.dr_bp_typ())) {
						msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$dr_ac_cd, MABCL0009, r.dr_ac_cd(), toDispGUIIndex(r)));
					}
				}

				if (!isNull(r.cr_ac_cd())) {
					if (!r.cr_bp_flg() && !MAC_BP_SET_TYP.isNON(r.cr_bp_typ())) {
						msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$cr_ac_cd, MABCL0008, r.cr_ac_cd(), toDispGUIIndex(r)));
					}
					else if (r.cr_bp_flg() && MAC_BP_SET_TYP.isNON(r.cr_bp_typ())) {
						msgList.add(new MCMessage(r, JnlPtn_UpdChk01_DtlR.$cr_ac_cd, MABCL0009, r.cr_ac_cd(), toDispGUIIndex(r)));
					}
				}
				// 会計部門の必須チェック
				if (MAC_DPT_TYP.isFIX(r.dr_dpt_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_dpt_cd, new FXUCL_RequiredValidater()));
				}
				if (MAC_DPT_TYP.isFIX(r.cr_dpt_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_dpt_cd, new FXUCL_RequiredValidater()));
				}
				// 仕訳Ｇの必須チェック
				if (!MAC_PTN_TYP.isMST(r.dr_ptn_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_grp_cd, new FXUCL_RequiredValidater()));
				}
				if (!MAC_PTN_TYP.isMST(r.cr_ptn_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_grp_cd, new FXUCL_RequiredValidater()));
				}
				// 取引先の必須チェック
				if (MAC_BP_SET_TYP.isFIX_CST(r.dr_bp_typ()) || MAC_BP_SET_TYP.isFIX_SPL(r.dr_bp_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_bp_cd, new FXUCL_RequiredValidater()));
				}
				if (MAC_BP_SET_TYP.isFIX_CST(r.cr_bp_typ()) || MAC_BP_SET_TYP.isFIX_SPL(r.cr_bp_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_bp_cd, new FXUCL_RequiredValidater()));
				}
				// 勘定科目ＣＤ、取引先区分、品目区分、金額区分、摘要区分の必須チェック
				if (MAC_PTN_TYP.isMST(r.dr_ptn_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_ac_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_bp_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_itm_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_amt_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$dr_abs_typ, new FXUCL_RequiredValidater()));
				}
				if (MAC_PTN_TYP.isMST(r.cr_ptn_typ())) {
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_ac_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_bp_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_itm_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_amt_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, JnlPtn_UpdChk01_DtlR.$cr_abs_typ, new FXUCL_RequiredValidater()));
				}
			}
			return msgList;
		}
	}
	/**
	 * JnlPtn_Upd01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの登録を行います。<br>
	 */
	public class JnlPtn_Upd01 extends MABCL_JnlPatternReg_MC_A.JnlPtn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_JnlPatternReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}