package mcframe.serverMSBH.MSBHL0010;

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
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;

import static mcframe.serverMSBH.MSBHL0010.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApDtlApplBalSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApDtlApplBalSrch_MC extends MSBHL_ApDtlApplBalSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未消込買掛明細の検索を行います。<br>
	 */
	public class Srch01 extends MSBHL_ApDtlApplBalSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initSearch() {
			super.initSearch();
			setUpTmpCol();
		}
		
		/**
		 * 検索条件を編集します
		 */
		protected void setUpTmpCol() {
			if (isSame(up0().ope(), "PAY")) {
				up0().addStringColumn("tmp_valid", MCBooleanUtil.booleanToDBString(true));
			}
			else {
				up0().addStringColumn("tmp_ap", MCBooleanUtil.booleanToDBString(true));
			}
			if (!isSame(up0().chk_flg(), up0().unchk_flg())) {
				up0().addStringColumn("tmp_chk", MCBooleanUtil.booleanToDBString(up0().chk_flg()));
			} 
			if (!isSame(up0().interim_flg(), up0().upri_flg())) {
				up0().addStringColumn("tmp_interim", MCBooleanUtil.booleanToDBString(up0().interim_flg()));
			} 
			if (!isSame(up0().crryovr_flg(), up0().not_crryovr_flg())) {
				up0().addStringColumn("tmp_crryovr", MCBooleanUtil.booleanToDBString(up0().crryovr_flg()));
			} 
			if (!isSame(up0().pay_spot_flg(), up0().not_pay_spot_flg())) {
				up0().addStringColumn("tmp_pay_spot", MCBooleanUtil.booleanToDBString(up0().pay_spot_flg()));
			} 
			if (!isSame(up0().subcon_flg(), up0().not_subcon_flg())) {
				up0().addStringColumn("tmp_subcon", MCBooleanUtil.booleanToDBString(up0().subcon_flg()));
			}
			else {
				up0().addStringColumn("tmp_subcon");
			}
			if (!isNull(up0().pass_days())) {
				up0().addDateColumn("tmp_pass_dt", getToday().addDay(up0().pass_days().negate()));
			}
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			searchForDL(MSBHL0010_MST_AP_D_S01(),
					up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			
			clearNoValidData();
			
			setValuesDbc(up0(), down0());
			
			down0().forEach(r -> {
				if (!r.sundry_itm_flg()) {
					r.itm_nm(r.itm_nm_itm());
				}
				if (r.valid_flg()) {
					r.pass_days(getToday().diffDay(r.ac_dt()));
				}
				
				invertNum(r);
			});
			
			if (isSame(up0().ope(), "PAY")) {
				down0().setAll(down0().subList(r -> !isBaseTaxDeff(r)));
			}
		}

		/**
		 * 支払対象外の行の支払用項目を削除する
		 */
		protected void clearNoValidData() {
			MCList<Srch01_RsltR> noValidL = down0().subList(Srch01_RsltR.$valid_flg, false);
			noValidL.forEach(r -> {
				r.pay_spot_flg(false);
				r.pay_schd_dt(null);
				r.pay_basis_dt(null);
				r.bsppl_cl_dt(null);
				r.bsppl_cl_day(null);
				r.bsppl_cd(null);
				r.bsppl_nm(null);
				r.bsppl_dpt_cd(null);
				r.pay_sts_typ(null);
				r.pay_mtd_typ(null);
			});
		}
		
		/**
		 * 金額・単価・数量の符号反転をする
		 * 
		 * @param r
		 */
		protected void invertNum(Srch01_RsltR r) {

			MCNumber amt_disp_pm = MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg());
			MCNumber upri_disp_pm = MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg());
			MCNumber qty_disp_pm = MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ());
			
			r.trd_cur_amt(r.trd_cur_amt().multiply(amt_disp_pm));
			r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(amt_disp_pm));
			if (!isNull(r.trd_cur_dscnt_amt())) {
				r.trd_cur_dscnt_amt(r.trd_cur_dscnt_amt().multiply(amt_disp_pm));
			}
			if (!isNull(r.wtax_amt())) {
				r.wtax_amt(r.wtax_amt().multiply(amt_disp_pm));
			}
			r.base_cur_amt(r.base_cur_amt().multiply(amt_disp_pm));
			r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(amt_disp_pm));
			if (!isNull(r.base_cur_dscnt_amt())) {
				r.base_cur_dscnt_amt(r.base_cur_dscnt_amt().multiply(amt_disp_pm));
			}
			
			
			r.trd_cur_upri(r.trd_cur_upri().multiply(upri_disp_pm));
			r.base_cur_upri(r.base_cur_upri().multiply(upri_disp_pm));
			
			r.trd_unit_qty(r.trd_unit_qty().multiply(qty_disp_pm));
			r.base_unit_qty(r.base_unit_qty().multiply(qty_disp_pm));
			if (!isNull(r.trd_cur_proc_upri())) {
				r.trd_cur_proc_upri(r.trd_cur_proc_upri().multiply(upri_disp_pm));
			}
			if (!isNull(r.trd_cur_proc_amt())) {
				r.trd_cur_proc_amt(r.trd_cur_proc_amt().multiply(amt_disp_pm));
			}
			if (!isNull(r.trd_cur_onr_prov_upri())) {
				r.trd_cur_onr_prov_upri(r.trd_cur_onr_prov_upri().multiply(upri_disp_pm));
			}
			if (!isNull(r.trd_cur_onr_prov_amt())) {
				r.trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt().multiply(amt_disp_pm));
			}
			if (!isNull(r.base_cur_proc_upri())) {
				r.base_cur_proc_upri(r.base_cur_proc_upri().multiply(upri_disp_pm));
			}
			if (!isNull(r.base_cur_proc_amt())) {
				r.base_cur_proc_amt(r.base_cur_proc_amt().multiply(amt_disp_pm));
			}
			if (!isNull(r.base_cur_onr_prov_upri())) {
				r.base_cur_onr_prov_upri(r.base_cur_onr_prov_upri().multiply(upri_disp_pm));
			}
			if (!isNull(r.base_cur_onr_prov_amt())) {
				r.base_cur_onr_prov_amt(r.base_cur_onr_prov_amt().multiply(amt_disp_pm));
			}
		}

		/**
		 * 基準単位通貨のみの税差額調整か判断する
		 * @param r 検索結果
		 * @return 基準単位通貨のみ税差額調整の場合、trueを返す
		 */
		protected boolean isBaseTaxDeff(Srch01_RsltR r) {
			
			if (r.trd_cur_tax_amt().isZero() && !r.base_cur_tax_amt().isZero()) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			down0().forEach(r -> {
				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
				r.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			});
		}
	}
	
	protected void setValuesDbc(Srch01_CndR upR, MCList<Srch01_RsltR> down) {
		setValuesDbc(MSBHL0010_Srch01_RsltR_J01(), upR, down);
	}

	//FMCB CUSTOM END
}