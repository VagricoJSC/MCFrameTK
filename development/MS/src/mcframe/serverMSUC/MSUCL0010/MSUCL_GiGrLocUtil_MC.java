package mcframe.serverMSUC.MSUCL0010;

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
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_GiGrLocUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_GiGrLocUtil_MC extends MSUCL_GiGrLocUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * 本クラス
	 */
	protected static final Class<MSUCL_GiGrLocUtil> CLAZZ = MSUCL_GiGrLocUtil.class;

	/**
	 * 出庫場所の情報から入庫場所の情報を補完する<br>
	 * <br>
	 * 以下の項目は必須<br>
	 * peg_no, itm_cd, itm_sub1, itm_sub2, itm_sub3<br>
	 * gi_loc_cd, gi_str_ln_cd, gi_stk_arrv_bp_cd, gi_stk_id_typ, gi_stk_bp_cd, gi_schd_dt<br>
	 * gr_loc_cd, gr_str_ln_cd, gr_schd_dt<br>
	 * <br>
	 * 以下の項目を補完する<br>
	 * 出庫関連 ： gi_sppl_cd, gi_wg_cd, gi_lg_grp_cd, gi_loc_mng_typ, gi_vmi_flg<br>
	 * 入庫関連 ： gr_stk_arrv_bp_cd, gr_stk_id_typ, gr_stk_bp_cd, gr_asst_typ, gr_sppl_cd,<br>
	 * gr_wg_cd, gr_lg_grp_cd, gr_loc_mng_typ, gr_prov_rcv_typ, gr_prov_basis_typ, gr_prov_typ<br>
	 * <br>
	 * gr_prov_basis_typ, gr_prov_typはリストに値が指定されている場合は、指定された値を優先する<br>
	 * 指定されていない場合はマスタから補完する<br>
	 * <br>
	 * gi_loc_cd, gr_loc_cdは通常は必須だが、指定しないことによって以下の動作を行うことができる<br>
	 * gr_loc_cdを指定してgi_loc_cdを指定しないと、入庫関連項目の補完だけ行う<br>
	 * gi_loc_cdを指定してgr_loc_cdを指定しないと、出庫関連項目の補完だけ行う<br>
	 */
	public static void setLocInfo(MCList<GiGr_LocR> list) {
		object(CLAZZ)._setLocInfo(list);
	}

	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache = null;

	protected void _setLocInfo(MCList<GiGr_LocR> list) {

		selectMst(list);

		for (GiGr_LocR r: list) {
			setGiGrLocInfo(r);
		}
	}

	protected void selectMst(MCList<GiGr_LocR> up) {
		selectLocL(up);
		selectGrLocL(up);
		selectProvUpriL(up);
	}

	protected void setGiGrLocInfo(GiGr_LocR r) {

		if (!isNull(r.gi_loc_cd())) {
			setGiLoc(r);
		}

		// 入庫場所が設定されていないレコードは出庫場所の情報だけ補完する
		if (isNull(r.gr_loc_cd())) {
			return;
		}

		setGrLoc(r);

		// 入庫場所のみ指定されている場合
		if (isNull(r.gi_loc_cd())) {
			// 支給
			if (!isNull(r.gr_sppl_cd())) {
				setByProvTyp(r);
			}
			else {	
				r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
			}	
		}
		// 出庫場所、入庫場所の両方指定されている場合
		else {
			// 社内移動
			if (isNullAnd(r.gi_sppl_cd(), r.gr_sppl_cd())) {
				// 自社在庫の場合
				if (MSC_STK_ID_TYP.isCOSTK(r.gi_stk_id_typ())) {
					r.gr_stk_arrv_bp_cd(nvl(r.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
					r.gr_stk_id_typ(r.gi_stk_id_typ());
					r.gr_stk_bp_cd(nvl(r.gi_stk_bp_cd(), MAC_STR.NULL_VAL.value()));
					r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
				}
				// ＶＭＩの場合
				else if (MSC_STK_ID_TYP.isRNT_RCV(r.gi_stk_id_typ()) && r.gi_vmi_flg()) {
					r.gr_stk_arrv_bp_cd(nvl(r.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
					r.gr_stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					r.gr_stk_bp_cd(MAC_STR.NULL_VAL.value());
					r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
				}
				// ＶＭＩ以外の他社資産
				else {
					r.gr_stk_arrv_bp_cd(nvl(r.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
					r.gr_stk_id_typ(r.gi_stk_id_typ());
					r.gr_stk_bp_cd(r.gi_stk_bp_cd());
					r.gr_asst_typ(MAC_ASST_TYP.OTH.value());
				}
			}
			// 支給
			else if (isNull(r.gi_sppl_cd())) {
				setByProvTyp(r);
			}
			// 支給返品
			else if (isNull(r.gr_sppl_cd())) {
				if(MSC_STK_ID_TYP.isNCV_RCV(r.gi_stk_id_typ())) {
					r.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					r.gr_stk_id_typ(r.gi_stk_id_typ());
					r.gr_stk_bp_cd(r.gi_stk_bp_cd());
					r.gr_asst_typ(MAC_ASST_TYP.OTH.value());
				}
				else {
					r.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					r.gr_stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					r.gr_stk_bp_cd(MAC_STR.NULL_VAL.value());
					r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
				}
			}
			// 外注直送
			else {
				// 発注先が同じ場合は移動・移送扱いなので編集の必要は無い
				if (isSame(r.gi_sppl_cd(), r.gr_sppl_cd())) {
					r.gr_stk_arrv_bp_cd(nvl(r.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
					r.gr_stk_id_typ(r.gi_stk_id_typ());
					r.gr_stk_bp_cd(nvl(r.gi_stk_bp_cd(), MAC_STR.NULL_VAL.value()));
					r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
				}
				// 発注先が異なる場合は支給返品＋支給なので支給と同じ編集を行う
				else {
					setByProvTyp(r);
				}
			}
		}
	}

	protected void setGiLoc(GiGr_LocR r) {

		MAM_LOC_R giLoc = _locCache.getEx(r.gi_loc_cd());
		r.gi_sppl_cd(giLoc.sppl_cd());
		r.gi_wg_cd(giLoc.wg_cd());
		r.gi_lg_grp_cd(giLoc.lg_grp_cd());
		r.gi_loc_mng_typ(giLoc.loc_mng_typ());
		r.gi_vmi_flg(giLoc.gi_vmi_flg());
	}

	protected void setGrLoc(GiGr_LocR r) {

		MAM_LOC_R grLoc = _grLocCache.getEx(r.gr_loc_cd());
		r.gr_sppl_cd(grLoc.sppl_cd());
		r.gr_wg_cd(grLoc.wg_cd());
		r.gr_lg_grp_cd(grLoc.lg_grp_cd());
		r.gr_loc_mng_typ(grLoc.loc_mng_typ());
		r.gr_prov_rcv_typ(grLoc.getString(MAM_BP_R.$prov_rcv_typ));
		r.setBooleanNE(MAM_BP_R.$repurc_obli_flg, convStringToBoolean(grLoc.getStringNE(MAM_BP_R.$repurc_obli_flg)));

		// 支給計上区分が設定されていない場合は取引先マスタの値を取得する
		if (isNull(r.gr_prov_basis_typ())) r.gr_prov_basis_typ(grLoc.getString(MAM_BP_R.$prov_basis_typ));

		// 支給区分が設定されていない場合は支給単価マスタの値を取得する
		if (!isNull(r.gr_sppl_cd()) && isNull(r.gr_prov_typ())) {
			MCDate schdDt = null;
			if (MAC_PROV_RCV_TYP.isNOT_ARR(r.gr_prov_rcv_typ())) {
				schdDt = nvl(r.gi_schd_dt(), r.gr_schd_dt());
			}
			else {
				schdDt = r.gr_schd_dt();
			}

			MAM_PROV_UPRI_R pu = null;
			if(_provUpriCache != null) {
				pu = _provUpriCache.get(schdDt,
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_sppl_cd(),
						grLoc.getString(MAM_BP_R.$cur_cd), r.gr_wg_cd());				
			}

			if (!isNull(pu) && MAC_PROV_TYP.isONR_PROV(pu.prov_typ())
					&& !MSC_STK_ID_TYP.isNCV_RCV(r.gr_stk_id_typ())) {
				r.gr_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
			}
			else {
				r.gr_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
			}
		}
	}

	protected void setByProvTyp(GiGr_LocR r) {

		if (MAC_PROV_TYP.isONR_PROV(r.gr_prov_typ())) {
			if (MAC_PROV_BASIS_TYP.isINPT(r.gr_prov_basis_typ())) {
				r.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				r.gr_stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				r.gr_stk_bp_cd(MAC_STR.NULL_VAL.value());
				r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
			}
			else {
				r.gr_stk_arrv_bp_cd(r.gr_sppl_cd());
				r.gr_stk_id_typ(MSC_STK_ID_TYP.ONR_PROV.value());
				r.gr_stk_bp_cd(r.gr_sppl_cd());
				// 買戻義務FLGがオンの場合
				if (r.getBooleanNE(MAM_BP_R.$repurc_obli_flg)) {
					r.gr_asst_typ(MAC_ASST_TYP.CO_PROD.value());
				}
				else {
					r.gr_asst_typ(MAC_ASST_TYP.OTH.value());
				}
			}
		}
		else {
			if (MSC_STK_ID_TYP.isCOSTK(r.gi_stk_id_typ())
					// ＶＭＩは購入して自社資産にする
					|| MSC_STK_ID_TYP.isRNT_RCV(r.gi_stk_id_typ())
					// 仕入検収前は直送支給の場合に発生する
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.gi_stk_id_typ())) {
				r.gr_stk_arrv_bp_cd(r.gr_sppl_cd());
				r.gr_stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				r.gr_stk_bp_cd(MAC_STR.NULL_VAL.value());
				r.gr_asst_typ(MAC_LOC_MNG_TYP.asst_typ(r.gr_loc_mng_typ()));
			}
			else {
				r.gr_stk_arrv_bp_cd(r.gr_sppl_cd());
				r.gr_stk_id_typ(r.gi_stk_id_typ());
				r.gr_stk_bp_cd(r.gi_stk_bp_cd());
				r.gr_asst_typ(MAC_ASST_TYP.OTH.value());
			}
		}
	}
	protected boolean convStringToBoolean(String s) {
		if (isNull(s)) {
			return false;
		}
		return s.equals("1") ? true : false;
	}

	//- 場所マスタ検索 ---------------------------------------------
	protected void selectLocL(MCList<GiGr_LocR> up) {

		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.wg_cd,
				t.sppl_cd,
				t.lg_grp_cd,
				t.loc_mng_typ,
				t.gi_vmi_flg);

		_locCache = new FXUCL_MCDbcCache<>(builder, up, GiGr_LocR.$gi_loc_cd);
	}

	//- 場所マスタ検索（入庫場所） ---------------------------------------------
	protected void selectGrLocL(MCList<GiGr_LocR> up) {

		MAM_LOC_R t = MAM_LOC_R.create("T");
		MAM_BP_R m = MAM_BP_R.create("M");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.wg_cd,
				t.sppl_cd,
				t.lg_grp_cd,
				t.loc_mng_typ);
		builder.addSelect(m.cur_cd,
				m.prov_rcv_typ,
				m.prov_basis_typ,
				m.repurc_obli_flg);
		builder.addLeftOuterJoin(m, t.sppl_cd.eq(m.bp_cd));

		_grLocCache = new FXUCL_MCDbcCache<>(builder, up, GiGr_LocR.$gr_loc_cd);
	}

	//- 支給単価マスタ検索 ---------------------------------------------
	protected void selectProvUpriL(MCList<GiGr_LocR> up) {

		// 支給区分が設定されていないレコードを抽出する
		MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
		for (GiGr_LocR r: up) {
			if (!isNull(r.gr_loc_cd()) && isNull(r.gr_prov_typ())) {
				if(MSC_STK_ID_TYP.isNCV_RCV(r.gr_stk_id_typ())) {
					continue;
				}
				MAM_LOC_R grLoc = _grLocCache.getEx(r.gr_loc_cd());

				if (!isNull(grLoc.sppl_cd())) {
					MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
					bindR.itm_cd(r.itm_cd());
					bindR.itm_sub1(r.itm_sub1());
					bindR.itm_sub2(r.itm_sub2());
					bindR.itm_sub3(r.itm_sub3());
					bindR.prsppl_cd(grLoc.sppl_cd());
					bindR.cur_cd(grLoc.getString(MAM_BP_R.$cur_cd));
					bindR.wg_cd(grLoc.wg_cd());
					bindL.add(bindR);
				}
			}
		}

		if (isSame(bindL.size(), 0)) {
			return;
		}

		MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.prov_typ);

		_provUpriCache = new FXUCL_MCDbcCacheStEnd<>(builder, bindL,
				MAM_PROV_UPRI_R.$itm_cd,
				MAM_PROV_UPRI_R.$itm_sub1,
				MAM_PROV_UPRI_R.$itm_sub2,
				MAM_PROV_UPRI_R.$itm_sub3,
				MAM_PROV_UPRI_R.$prsppl_cd,
				MAM_PROV_UPRI_R.$cur_cd,
				MAM_PROV_UPRI_R.$wg_cd);
	}
	//FMCB CUSTOM END
}