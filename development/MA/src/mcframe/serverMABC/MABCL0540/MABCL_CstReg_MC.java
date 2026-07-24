package mcframe.serverMABC.MABCL0540;

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
import mcframe.serverMABS.MABSL0230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0480.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0520.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0650.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0660.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0540.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_CstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_CstReg_MC extends MABCL_CstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpCst_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタの登録前のチェックを行います。<br>
	 */
	public class BpCst_UpdChk01 extends MABCL_CstReg_MC_A.BpCst_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (BpCst_UpdChk01_DtlR r : up0()) {
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (!r.cst_sundry_flg()) {
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$acst_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$ar_dpt_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$sls_upri_rnd_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$sls_tax_calc_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$bill_crryovr_times, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$lot_back_stop_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$slip_each_lot_typ, new FXUCL_RequiredValidater()));
				}
				if (MAC_AR_DPT_TYP.isAR(r.ar_dpt_typ())) {
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$ar_dpt_cd, new FXUCL_RequiredValidater()));
				}
				if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(r.sls_basis_typ())) {
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$bill_basis_typ, new FXUCL_RequiredValidater()));
				}
				if (r.stk_lst_issue_flg()) {
					msgList.addAll(check(r, BpCst_UpdChk01_DtlR.$stk_lst_form_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!isNull(r.ar_dpt_cd()) && !MAC_AR_DPT_TYP.isAR(r.ar_dpt_typ())) {
					msgList.add(new MCMessage(r, BpCst_UpdChk01_DtlR.$ar_dpt_cd, MABCL0135, toDispGUIIndex(r)));
				}
				if (MAC_SLS_BASIS_TYP.isIN_BASIS(r.sls_basis_typ()) && 
						!MAC_BILL_BASIS_TYP.isSLS_AC(r.bill_basis_typ())) {
					msgList.add(new MCMessage(r, BpCst_UpdChk01_DtlR.$bill_basis_typ, MABCL0136, toDispGUIIndex(r)));
				}
				if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(r.sls_basis_typ())
						&& !MAC_BILL_BASIS_TYP.isARRV(r.bill_basis_typ())) {
					msgList.add(new MCMessage(r, BpCst_UpdChk01_DtlR.$bill_basis_typ, MABCL0602, toDispGUIIndex(r)));
				}
				if (isNull(r.sls_basis_typ()) && !isNull(r.bill_basis_typ())) {
					msgList.add(new MCMessage(r, BpCst_UpdChk01_DtlR.$bill_basis_typ, MABCL0137, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * BpCst_Upd01オペレーション.<p>
	 *
	 * 取引先マスタの登録を行います。<br>
	 */
	public class BpCst_Upd01 extends MABCL_CstReg_MC_A.BpCst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_BP_R){
				dbcCustomizeSet(builder);
			}
		}
		
		// 上り電文だけを更新する
		protected void dbcCustomizeSet(MCQueryApiBuilder builder) {

			String[] cols = BpCst_UpdChk01_DtlR.colnames();
			String[] keyCols = builder.getBaseDbc().getKeyColumn();
			
			int i = 0;
			for (String c : cols) {
				boolean isContains = false;
				for (String k : keyCols) {
					if (isSame(c, k) || isSame(c, BpCst_UpdChk01_DtlR.$check_ar_dpt_cd) || isSame(c, BpCst_UpdChk01_DtlR.$bcst_flg)) {
						isContains = true;
					}
				}
				if (!isContains) {
					if (i==0) {
						builder.setSet(builder.getBaseDbc().getColumn$(c));
					}
					else {
						builder.addSet(builder.getBaseDbc().getColumn$(c));
					}
					i++;
				}
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 得意先関連マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_CstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_CST_USR_R 
					|| builder.getBaseDbc() instanceof MAM_CST_SLS_UPRI_RANK_R
					|| builder.getBaseDbc() instanceof MAM_CST_DLV_R
					|| builder.getBaseDbc() instanceof MAM_SHIP_VALID_CTL_R
					|| builder.getBaseDbc() instanceof MAM_SLO_ALLOC_GD_R) {
				dbcCustomizeSub(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_BP_R) {
				dbcCustomizeSub_Bp(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_BP_ITM_R) {
				dbcCustomizeSub_BpItm(builder, rslt);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MCDBContainer t = builder.getBaseDbc();

			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(t.getColumn$("cst_cd"), bind(Srch01_CndR.$bp_cd)));

			if (builder.getBaseDbc() instanceof MAM_CST_USR_R) {
				MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
				MAM_CST_USR_R t1 = MAM_CST_USR_R.create(builder.getBaseDbcAlias());
				builder.addLeftOuterJoin(dpt1, dpt1.dpt_cd.eq(t1.dpt_cd)
						.and(dpt1.st_dt.lte(t1.st_dt))
						.and(dpt1.end_dt.gte(t1.st_dt)));
				builder.addSelect(dpt1.dpt_nm);
			}
		}

		protected void dbcCustomizeSub_Bp(MCQueryApiBuilder builder) {
			MAM_SLS_ANLY_R sls_anly1 = MAM_SLS_ANLY_R.create("SLS_ANLY1");
			MAM_SLS_ANLY_R sls_anly2 = MAM_SLS_ANLY_R.create("SLS_ANLY2");
			MAM_SLS_ANLY_R sls_anly3 = MAM_SLS_ANLY_R.create("SLS_ANLY3");
			MAM_BP_R t = MAM_BP_R.create(builder.getBaseDbcAlias());

			builder.addWhereWithAnd(t.cst_flg.eq(value(true)));
			builder.addSelect(sls_anly1.sls_anly_nm.as("sls_anly_nm1"));
			builder.addSelect(sls_anly2.sls_anly_nm.as("sls_anly_nm2"));
			builder.addSelect(sls_anly3.sls_anly_nm.as("sls_anly_nm3"));
			builder.addLeftOuterJoin(sls_anly1, sls_anly1.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY1.value()))
					.and(sls_anly1.sls_anly_cd.eq(t.sls_anly_cd1)));
			builder.addLeftOuterJoin(sls_anly2, sls_anly2.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY2.value()))
					.and(sls_anly2.sls_anly_cd.eq(t.sls_anly_cd2)));
			builder.addLeftOuterJoin(sls_anly3, sls_anly3.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY3.value()))
					.and(sls_anly3.sls_anly_cd.eq(t.sls_anly_cd3)));
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub_BpItm(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_BP_ITM_R.$ITM1);

			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);

			builder.addSelect(itm1.sundry_itm_flg);
			rslt.addBooleanColumn("sundry_itm_flg");
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 得意先関連マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_CstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}