package mcframe.serverMABC.MABCL0570;

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
import mcframe.serverMABS.MABSL0670.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0530.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0190.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0570.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SpplReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SpplReg_MC extends MABCL_SpplReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * Bp_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタ（発注先関連）の登録前のチェックを行います。<br>
	 */
	public class Bp_UpdChk01 extends MABCL_SpplReg_MC_A.Bp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			String _co_cntry = getCo().cntry_cd() ;

			for(Bp_UpdChk01_DtlR r : up0()){
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (r.onr_prsppl_flg()) {
					msgList.addAll(check(r, Bp_UpdChk01_DtlR.$prov_basis_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, Bp_UpdChk01_DtlR.$prov_amt_rnd_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, Bp_UpdChk01_DtlR.$prov_tax_calc_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, Bp_UpdChk01_DtlR.$prov_tax_rnd_typ, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!isSame(r.cntry_cd(), _co_cntry) && r.subcon_flg()) {
					
					msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$subcon_flg, MABCL0126, toDispGUIIndex(r)));
				}
				if (!r.onr_prsppl_flg()) {
					if (r.prov_upri_cng_flg()) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_upri_cng_flg, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_upri_cng_flg), toDispGUIIndex(r)));
					}
					if (r.prov_tax_cd_prio_flg()) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_tax_cd_prio_flg, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_tax_cd_prio_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.prov_tax_cd())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_tax_cd, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_tax_cd), toDispGUIIndex(r)));
					}
					if (!isNull(r.outsrc_upri_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$outsrc_upri_typ, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$outsrc_upri_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.prov_basis_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_basis_typ, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_basis_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.prov_amt_rnd_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_amt_rnd_typ, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_amt_rnd_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.prov_tax_calc_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_tax_calc_typ, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_tax_calc_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.prov_tax_rnd_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_tax_rnd_typ, MABCL0262,
								getLabel(r, Bp_UpdChk01_DtlR.$prov_tax_rnd_typ), toDispGUIIndex(r)));
					}

				}
				else if (!isNull(r.prov_rcv_typ()) && !isNull(r.prov_basis_typ())) {
					if (r.subcon_flg()) {
						if (MAC_PROV_RCV_TYP.isNOT_ARR(r.prov_rcv_typ()) && !MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())) {
							msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_basis_typ,MABCL0127, toDispGUIIndex(r)));
						}
					}
					else {
						if (MAC_PROV_RCV_TYP.isNOT_ARR(r.prov_rcv_typ()) && 
								(!(MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ()) || MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())))) {
							msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_basis_typ,MABCL0128, toDispGUIIndex(r)));
						}
					}
					if (!MAC_PROV_RCV_TYP.isNOT_ARR(r.prov_rcv_typ()) &&
							(!(MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())|| MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())))) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$prov_basis_typ,MABCL0129, toDispGUIIndex(r)));
					}
				}
				if (r.subcon_flg()) {
					if (!isNull(r.purc_basis_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$purc_basis_typ, MABCL0543, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.sppl_ship_form_cd()) && (r.po_dlv_slip_flg() || r.dlv_inst_dlv_slip_flg() || r.prms_rcpt_dlv_slip_flg())) {
					msgList.add(new MCMessage(r,  null, MABCL0651, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * Bp_Upd01オペレーション.<p>
	 *
	 * 取引先マスタ（発注先関連）の登録を行います。<br>
	 */
	public class Bp_Upd01 extends MABCL_SpplReg_MC_A.Bp_Upd01 {
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

			String[] cols = Bp_UpdChk01_DtlR.colnames();
			String[] keyCols = builder.getBaseDbc().getKeyColumn();
			
			int i = 0;
			for (String c : cols) {
				boolean isContains = false;
				for (String k : keyCols) {
					if (isSame(c, k) || isSame(c, MAM_BP_R.$cntry_cd) || isSame(c, Bp_UpdChk01_DtlR.$check_vmi_purc_dpt_cd)
							|| isSame(c, Bp_UpdChk01_DtlR.$bsppl_flg) || isSame(c, Bp_UpdChk01_DtlR.$check_ap_dpt_cd)) {
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
	 * 発注先関連の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SpplReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_BP_R) {
				dbcCustomizeSub_Bp(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_ITM_DTL__R
					|| builder.getBaseDbc() instanceof MAM_ITM_INSP_R
					|| builder.getBaseDbc() instanceof MAM_PURC_DDLV_LT_R
					|| builder.getBaseDbc() instanceof MAM_BP_ITM_R) {
				dbcSetItmTyp(builder, rslt);
				dbcSetWhereSppl(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_SPPL_USR_R) {
				dbcCustomizeSub_SpplUsr(builder);
				dbcSetWhereSppl(builder);
			}
		}

		protected void dbcCustomizeSub_Bp(MCQueryApiBuilder builder) {
			MAM_BP_R t = MAM_BP_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}

		protected void dbcSetWhereSppl(MCQueryApiBuilder builder) {
			MCDBContainer t = builder.getBaseDbc();
			if (!(builder.getBaseDbc() instanceof MAM_BP_ITM_R)) {
				builder.addWhereWithAnd(MCQueryApiBuilder.makeEq(t.getColumn$("sppl_cd"), bind(Srch01_CndR.$bp_cd)));
			}
		}

		protected <R extends MCDBContainer> void dbcSetItmTyp(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			MAM_ITM__R itm1 = MAM_ITM__R.create("ITM1");

			builder.addLeftOuterJoin(itm_typ_d1, bracket( itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd))));
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);

			rslt.addBooleanColumn(MAM_ITM__R.$sundry_itm_flg);
			builder.addSelect(itm1.sundry_itm_flg);

			builder.addSelect(itm1.stk_mng_typ);
			builder.addSelect(itm1.sno1_mng_typ);
			builder.addSelect(itm1.sno2_mng_typ);
			builder.addSelect(itm1.sno3_mng_typ);
			builder.addSelect(itm1.sno4_mng_typ);
			builder.addSelect(itm1.unit_cd);
			builder.addSelect(itm1.dec_place);
		}

		protected void dbcCustomizeSub_SpplUsr(MCQueryApiBuilder builder) {
			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
			MAM_SPPL_USR_R t = MAM_SPPL_USR_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(dpt1, bracket( t.purc_dpt_cd.eq(dpt1.dpt_cd)
					.and(t.st_dt.between(dpt1.st_dt, dpt1.end_dt))));
			builder.addLeftOuterJoin(dpt2, bracket( t.outsrc_dpt_cd.eq(dpt2.dpt_cd)
					.and(t.st_dt.between(dpt2.st_dt, dpt2.end_dt))));
			builder.addSelect(dpt1.dpt_nm.as("purc_dpt_nm"));
			builder.addSelect(dpt2.dpt_nm.as("outsrc_dpt_nm"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目補助マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_SpplReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}