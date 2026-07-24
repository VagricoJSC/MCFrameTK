package mcframe.serverMGBA.MGBAL0200;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBA.MGBAL0200.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBA.MGBAL0200.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBAL_ActPlnCopy"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBAL_ActPlnCopy_MC extends MGBAL_ActPlnCopy_MC_A{
	//FMCB CUSTOM START

	/** 売上計画コピー時の「得意先・納品先・担当者・仕向先１～３・売上分類１～５」 引継ぎフラグ */
	protected boolean _slsInheritAttrFlg = getPgmSettingBoolean(this, "sls", "inherit_attr");

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月別コピー前のチェックを行います。<br>
	 */
	public class Chk01 extends MGBAL_ActPlnCopy_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			for(String ctg : MCStringUtil.arrayValueSplit(up0().act_calc_ctg_cd())){
				Chk01_Cnd2R calcR = Chk01_Cnd2R.create();
				calcR.act_calc_ctg_cd(ctg);
				calcR.setAttributes(up0());
				up1().add(calcR);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 集計コピー前のチェックを行います。<br>
	 */
	public class Chk02 extends MGBAL_ActPlnCopy_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			for(String ctg : MCStringUtil.arrayValueSplit(up0().act_calc_ctg_cd())){
				Chk01_Cnd2R calcR = Chk01_Cnd2R.create();
				calcR.act_calc_ctg_cd(ctg);
				calcR.setAttributes(up0());
				up1().add(calcR);
			}
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 月別コピーを行います。<br>
	 */
	public class Ins01 extends MGBAL_ActPlnCopy_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk01();
			throwUpdErr();
			editUp();
			copy();
		}

		protected void editUp() {
			setBind(up0());
			up0().bcur_cd(getBaseCur().cur_cd());
			up0().act_ym(up0().act_ym_fr());
			up0().pln_ym(up0().pln_ym_fr());
			up0().act_ym_fr(null);
		}

		protected void callThisChk01() {
			MGBAL_ActPlnCopy.Chk01 ope = MGBAL_ActPlnCopy.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void copy() {
			for (; up0().act_ym().lte(up0().act_ym_to()); up0().act_ym(up0().act_ym().addMonth(1))) {
				if (up0().mfg_flg()) {
					lockDelMfg(up0());
					insMfg(up0());
				}
				if (up0().purc_flg()) {
					lockDelPurc(up0());
					insPurc(up0());
				}
				if (up0().inpt_flg()) {
					lockDelInpt(up0());
					insInpt(up0());
				}
				if (up0().itm_wk_flg()) {
					lockDelItmWk(up0());
					insItmWk(up0());
				}
				if (up0().other_wk_flg()) {
					lockDelOtherWk(up0());
					insOtherWk(up0());
				}
				if (up0().sls_flg()) {
					lockDelSls(up0());
					insSls(up0());
				}
				up0().pln_ym(up0().pln_ym().addMonth(1));
			}
		}
	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 集計コピーを行います。<br>
	 */
	public class Ins02 extends MGBAL_ActPlnCopy_MC_A.Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk02();
			throwUpdErr();
			editUp();
			copy();
		}

		protected void editUp() {
			setBind(up0());
			up0().bcur_cd(getBaseCur().cur_cd());
			up0().pln_ym(up0().pln_ym_fr());
			up0().act_ym(null);
		}

		protected void callThisChk02() {
			MGBAL_ActPlnCopy.Chk02 ope = MGBAL_ActPlnCopy.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void copy() {
			if(up0().mfg_flg()){
				lockDelMfg(up0());
				insMfg(up0());
			}
			if(up0().purc_flg()){
				lockDelPurc(up0());
				insPurc(up0());
			}
			if(up0().inpt_flg()){
				lockDelInpt(up0());
				insInpt(up0());
			}
			if(up0().itm_wk_flg()){
				lockDelItmWk(up0());
				insItmWk(up0());
			}
			if(up0().other_wk_flg()){
				lockDelOtherWk(up0());
				insOtherWk(up0());
			}
			if(up0().sls_flg()){
				lockDelSls(up0());
				insSls(up0());
			}
		}
	}

	// -----------------------------------------------
	// Common
	protected void setBind(Chk01_CndR r){
		r.null_val(MAC_STR.NULL_VAL.value());
		r.asst_prod(MAC_ASST_TYP.CO_PROD.value());
		r.prov_ffr(MAC_PROV_TYP.FFR_PROV.value());
		r.prov_onr(MAC_PROV_TYP.ONR_PROV.value());
		r.prov_ss(MAC_PROV_TYP.SS.value());
		r.ac_slip_in_onr(MAC_AC_SLIP_TYP.IN_ONR.value());
		r.ac_slip_in_ss(MAC_AC_SLIP_TYP.IN_SS.value());
	}

	protected void lockDelMfg(Chk01_CndR r) {
		MGT_PLN_MFG_R t = MGT_PLN_MFG_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		createMfgDbc(t, dbc_bldr);
		dbSelectForUpdateNoWaitNoFetch("MGBAL0200_MGT_PLN_MFG_S01", dbc_bldr, r);
		dbc_bldr.buildDelete("MGBAL0200_MGT_PLN_MFG_D01").executeUpdate(r);
	}
	protected void createMfgDbc(MGT_PLN_MFG_R t, MCQueryApiBuilder dbc_bldr) {
		MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")));
		dbc_bldr.addWhereWithAnd(t.ym.eq(bind("pln_ym")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(S1W.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	protected void lockDelPurc(Chk01_CndR r) {
		MGT_PLN_PURC_R t = MGT_PLN_PURC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		createPurcDbc(t, dbc_bldr);
		dbSelectForUpdateNoWaitNoFetch("MGBAL0200_MGT_PLN_PURC_S01", dbc_bldr, r);
		dbc_bldr.buildDelete("MGBAL0200_MGT_PLN_PURC_D01").executeUpdate(r);
	}
	protected void createPurcDbc(MGT_PLN_PURC_R t, MCQueryApiBuilder dbc_bldr) {
		MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")));
		dbc_bldr.addWhereWithAnd(t.ym.eq(bind("pln_ym")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(S1W.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	protected void lockDelInpt(Chk01_CndR r) {
		MGT_PLN_INPT_R t = MGT_PLN_INPT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		createInptDbc(t, dbc_bldr);
		dbSelectForUpdateNoWaitNoFetch("MGBAL0200_MGT_PLN_INPT_S01", dbc_bldr, r);
		dbc_bldr.buildDelete("MGBAL0200_MGT_PLN_INPT_D01").executeUpdate(r);
	}
	protected void createInptDbc(MGT_PLN_INPT_R t, MCQueryApiBuilder dbc_bldr) {
		MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")));
		dbc_bldr.addWhereWithAnd(t.ym.eq(bind("pln_ym")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(S1W.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	protected void lockDelItmWk(Chk01_CndR r) {
		MGT_PLN_ITM_WK_R t = MGT_PLN_ITM_WK_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		createItmWkDbc(t, dbc_bldr);
		dbSelectForUpdateNoWaitNoFetch("MGBAL0200_MGT_PLN_ITM_WK_S01", dbc_bldr, r);
		dbc_bldr.buildDelete("MGBAL0200_MGT_PLN_ITM_WK_D01").executeUpdate(r);
	}
	protected void createItmWkDbc(MGT_PLN_ITM_WK_R t, MCQueryApiBuilder dbc_bldr) {
		MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")));
		dbc_bldr.addWhereWithAnd(t.ym.eq(bind("pln_ym")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(S1W.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	protected void lockDelOtherWk(Chk01_CndR r) {
		MGT_PLN_OTHER_WK_R t = MGT_PLN_OTHER_WK_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		createOtherWkDbc(t, dbc_bldr);
		dbSelectForUpdateNoWaitNoFetch("MGBAL0200_MGT_PLN_OTHER_WK_S01", dbc_bldr, r);
		dbc_bldr.buildDelete("MGBAL0200_MGT_PLN_OTHER_WK_D01").executeUpdate(r);
	}
	protected void createOtherWkDbc(MGT_PLN_OTHER_WK_R t, MCQueryApiBuilder dbc_bldr) {
		MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")));
		dbc_bldr.addWhereWithAnd(t.ym.eq(bind("pln_ym")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(S1W.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	protected void lockDelSls(Chk01_CndR r) {
		MGT_PLN_SLS_R t = MGT_PLN_SLS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		createSlsDbc(t, dbc_bldr);
		dbSelectForUpdateNoWaitNoFetch("MGBAL0200_MGT_PLN_SLS_S01", dbc_bldr, r);
		dbc_bldr.buildDelete("MGBAL0200_MGT_PLN_SLS_D01").executeUpdate(r);
	}
	protected void createSlsDbc(MGT_PLN_SLS_R t, MCQueryApiBuilder dbc_bldr) {
		MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")));
		dbc_bldr.addWhereWithAnd(t.ym.eq(bind("pln_ym")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(S1W.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	protected void insMfg(Chk01_CndR r){
		executeUpdate(MGBAL0200_MGT_PLN_MFG_I01(), r);
	}
	protected void insPurc(Chk01_CndR r){
		executeUpdate(MGBAL0200_MGT_PLN_PURC_I01(), r);
	}
	protected void insInpt(Chk01_CndR r){
		executeUpdate(MGBAL0200_MGT_PLN_INPT_I01(), r);
	}
	protected void insItmWk(Chk01_CndR r){
		executeUpdate(MGBAL0200_MGT_PLN_ITM_WK_I01(), r);
	}
	protected void insOtherWk(Chk01_CndR r){
		executeUpdate(MGBAL0200_MGT_PLN_OTHER_WK_I01(), r);
	}
	protected void insSls(Chk01_CndR r){
		if (_slsInheritAttrFlg) {
			executeUpdate(MGBAL0200_MGT_PLN_SLS_I02(), r);
		}
		else {
			executeUpdate(MGBAL0200_MGT_PLN_SLS_I01(), r);
		}
	}

	//FMCB CUSTOM END
}