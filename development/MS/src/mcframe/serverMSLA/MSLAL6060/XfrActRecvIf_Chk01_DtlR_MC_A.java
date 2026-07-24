package mcframe.serverMSLA.MSLAL6060;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"XfrActRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrActRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $xa = "xa";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public static final String $xfr_act_no = "xfr_act_no";
	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_act_d_no = "xfr_act_d_no";
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gr_site_cd = "gr_site_cd";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	public static final String $xah = "xah";
	public static final String $xad = "xad";

	public static final String $data_lno = $xa + ".data_lno";
	public static final String $data_no = $xa + ".data_no";
	public static final String $data_crud_typ = $xa + ".data_crud_typ";
	public static final String $exe_sts_typ = $xa + ".exe_sts_typ";
	public static final String $ext_sys_cd = $xa + ".ext_sys_cd";
	public static final String $ext_data_lno = $xa + ".ext_data_lno";
	public static final String $ext_data_no = $xa + ".ext_data_no";
	public static final String $data_make_dt = $xa + ".data_make_dt";
	public static final String $imp_flg = $xa + ".imp_flg";
	public static final String $recv_dt = $xa + ".recv_dt";
	public static final String $xfr_inst_no = $xa + ".xfr_inst_no";
	public static final String $trd_cd = $xa + ".trd_cd";
	public static final String $rsn_cd = $xa + ".rsn_cd";
	public static final String $bd_dpt_cd = $xa + ".bd_dpt_cd";
	public static final String $xfr_dt = $xa + ".xfr_dt";
	public static final String $act_dpt_cd = $xa + ".act_dpt_cd";
	public static final String $act_usr_cd = $xa + ".act_usr_cd";
	public static final String $xfr_alloc_sts_no = $xa + ".xfr_alloc_sts_no";
	public static final String $ext_xfr_act_no = $xa + ".ext_xfr_act_no";
	public static final String $lg_grp_cd = $xa + ".lg_grp_cd";
	public static final String $gi_loc_cd = $xa + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $xa + ".gi_str_ln_cd";
	public static final String $gr_loc_cd = $xa + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $xa + ".gr_str_ln_cd";
	public static final String $itm_cd = $xa + ".itm_cd";
	public static final String $itm_sub1 = $xa + ".itm_sub1";
	public static final String $itm_sub2 = $xa + ".itm_sub2";
	public static final String $itm_sub3 = $xa + ".itm_sub3";
	public static final String $lot_no = $xa + ".lot_no";
	public static final String $sublot_no = $xa + ".sublot_no";
	public static final String $sno1 = $xa + ".sno1";
	public static final String $sno2 = $xa + ".sno2";
	public static final String $sno3 = $xa + ".sno3";
	public static final String $sno4 = $xa + ".sno4";
	public static final String $gd_cd = $xa + ".gd_cd";
	public static final String $quality_typ = $xa + ".quality_typ";
	public static final String $stk_insp_typ = $xa + ".stk_insp_typ";
	public static final String $stk_id_typ = $xa + ".stk_id_typ";
	public static final String $stk_bp_cd = $xa + ".stk_bp_cd";
	public static final String $trd_unit_qty = $xa + ".trd_unit_qty";
	public static final String $trd_unit_cd = $xa + ".trd_unit_cd";
	public static final String $abort_flg = $xa + ".abort_flg";
	public static final String $base_dlv_slip_no = $xa + ".base_dlv_slip_no";
	public static final String $base_prov_act_no = $xa + ".base_prov_act_no";
	public static final String $base_ac_dt = $xa + ".base_ac_dt";
	public static final String $intr_d_rmrks = $xa + ".intr_d_rmrks";

	public static final MCMeta xa_META = createInnerRowMeta($xa, mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_act_no_META = createCommonMeta($xfr_act_no, mcframe.commonMA.meta.MA_META.XFR_ACT_NO);
	public static final MCMeta xfr_act_d_no_META = createCommonMeta($xfr_act_d_no, mcframe.commonMA.meta.MA_META.XFR_ACT_D_NO);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta xah_META = createInnerRowMeta($xah, mcframe.serverMS.dbc.MST_XFR_ACT_R.class);
	public static final MCMeta xad_META = createInnerRowMeta($xad, mcframe.serverMS.dbc.MST_XFR_ACT_D_R.class);

	protected static final ConstMetaList<XfrActRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<XfrActRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xa_META,
			err_flg_META,
			acxfr_gi_flg_META,
			xfr_act_no_META,
			xfr_act_d_no_META,
			gr_site_cd_META,
			gi_site_cd_META,
			xah_META,
			xad_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"exe_sts_typ",
				"ext_sys_cd",
				"ext_data_lno",
				"ext_data_no",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"xfr_inst_no",
				"trd_cd",
				"rsn_cd",
				"bd_dpt_cd",
				"xfr_dt",
				"act_dpt_cd",
				"act_usr_cd",
				"xfr_alloc_sts_no",
				"ext_xfr_act_no",
				"lg_grp_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"abort_flg",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"intr_d_rmrks"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$exe_sts_typ,
				$ext_sys_cd,
				$ext_data_lno,
				$ext_data_no,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$xfr_inst_no,
				$trd_cd,
				$rsn_cd,
				$bd_dpt_cd,
				$xfr_dt,
				$act_dpt_cd,
				$act_usr_cd,
				$xfr_alloc_sts_no,
				$ext_xfr_act_no,
				$lg_grp_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$abort_flg,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$intr_d_rmrks
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$xa + ".xfr_dt", "E"},	// xa.xfr_dt
				{$xa + ".gi_loc_cd", "E"},	// xa.gi_loc_cd
				{$xa + ".gr_loc_cd", "E"},	// xa.gr_loc_cd
				{$xa + ".itm_cd", "E"},	// xa.itm_cd
				{$xa + ".abort_flg", "E"}	// xa.abort_flg
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$xa + ".trd_cd", "MA.MAUAL0010.Trd"},	// xa.trd_cd
				{$xa + ".rsn_cd", "MA.MAUAL0010.XfrBizRsn"},	// xa.rsn_cd
				{$xa + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"},	// xa.bd_dpt_cd
				{$xa + ".act_dpt_cd", "MA.MAUAL0010.Dpt"},	// xa.act_dpt_cd
				{$xa + ".act_usr_cd", "MA.MAUAL0010.Usr"},	// xa.act_usr_cd
				{$xa + ".gi_loc_cd", "MA.MAUAL0010.Loc"},	// xa.gi_loc_cd
				{$xa + ".gi_str_ln_cd", "MA.MAUAL0010.StrLn"},	// xa.gi_str_ln_cd
				{$xa + ".gr_loc_cd", "MA.MAUAL0010.Loc"},	// xa.gr_loc_cd
				{$xa + ".gr_str_ln_cd", "MA.MAUAL0010.StrLn"},	// xa.gr_str_ln_cd
				{$xa + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// xa.itm_sub3
				{$xa + ".gd_cd", "MA.MAUAL0010.StkGd"},	// xa.gd_cd
				{$xa + ".stk_bp_cd", "MA.MAUAL0010.Bp"},	// xa.stk_bp_cd
				{$xa + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"}	// xa.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$xa + ".rsn_cd", "acxfr_gi_flg"},	// xa.rsn_cd
				{$xa + ".gi_loc_cd", "gi_lg_grp_cd;gi_site_cd"},	// xa.gi_loc_cd
				{$xa + ".gr_loc_cd", "lg_grp_cd;gr_site_cd"}	// xa.gr_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$xa + ".gi_loc_cd", "lg_grp_cd;site_cd"},	// xa.gi_loc_cd
				{$xa + ".gr_loc_cd", "lg_grp_cd;site_cd"}	// xa.gr_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$xa + ".bd_dpt_cd", "xfr_dt;MAC_DPT_IS_SRCH_TYP.BD;true"},	// xa.bd_dpt_cd
				{$xa + ".act_dpt_cd", "xfr_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"},	// xa.act_dpt_cd
				{$xa + ".gi_str_ln_cd", "gi_loc_cd;true"},	// xa.gi_str_ln_cd
				{$xa + ".gr_str_ln_cd", "gr_loc_cd;true"},	// xa.gr_str_ln_cd
				{$xa + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// xa.itm_sub3
				{$xa + ".stk_bp_cd", "true"},	// xa.stk_bp_cd
				{$xa + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// xa.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$xa + ".bd_dpt_cd", "dt;dpt_is_srch_typ;mode_nullval_flg"},	// xa.bd_dpt_cd
				{$xa + ".act_dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// xa.act_dpt_cd
				{$xa + ".gi_str_ln_cd", "loc_cd;mode_nullval_flg"},	// xa.gi_str_ln_cd
				{$xa + ".gr_str_ln_cd", "loc_cd;mode_nullval_flg"},	// xa.gr_str_ln_cd
				{$xa + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// xa.itm_sub3
				{$xa + ".stk_bp_cd", "mode_nullval_flg"},	// xa.stk_bp_cd
				{$xa + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// xa.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$xa + ".gi_str_ln_cd", "E"},	// xa.gi_str_ln_cd
				{$xa + ".gr_str_ln_cd", "E"},	// xa.gr_str_ln_cd
				{$xa + ".itm_sub1", "E"},	// xa.itm_sub1
				{$xa + ".itm_sub2", "E"},	// xa.itm_sub2
				{$xa + ".itm_sub3", "E"}	// xa.itm_sub3
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected XfrActRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends XfrActRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActRecvIf_Chk01_DtlR clone() {
		return (XfrActRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActRecvIf_Chk01_DtlR createInstance() {
		return (XfrActRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActRecvIf_Chk01_DtlR getValues(String... names) {
		return (XfrActRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R xa(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R) getConstInnerRow(offset + 0, $xa);
	}
	
	public void xa(mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $xa, row);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 2, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 2, $acxfr_gi_flg, value);
	}


	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return getConstString(offset + 3, $xfr_act_no);
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		setConstString(offset + 3, $xfr_act_no, value);
	}


	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public String xfr_act_d_no() {
		return getConstString(offset + 4, $xfr_act_d_no);
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		setConstString(offset + 4, $xfr_act_d_no, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 5, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 5, $gr_site_cd, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 6, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 6, $gi_site_cd, value);
	}


	public mcframe.serverMS.dbc.MST_XFR_ACT_R xah(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_R) getConstInnerRow(offset + 7, $xah);
	}
	
	public void xah(mcframe.serverMS.dbc.MST_XFR_ACT_R row){
		setConstInnerRow(offset + 7, $xah, row);
	}


	public mcframe.serverMS.dbc.MST_XFR_ACT_D_R xad(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_D_R) getConstInnerRow(offset + 8, $xad);
	}
	
	public void xad(mcframe.serverMS.dbc.MST_XFR_ACT_D_R row){
		setConstInnerRow(offset + 8, $xad, row);
	}


	public String getString(String name) {
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xa.equalsIgnoreCase(name)) {
			return xa();
		}
		if ($xah.equalsIgnoreCase(name)) {
			return xah();
		}
		if ($xad.equalsIgnoreCase(name)) {
			return xad();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xa.equalsIgnoreCase(name)) {
			xa(
				((MCContainerMeta) xa_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R.class, value)
			);
			return;
		}
		if ($xah.equalsIgnoreCase(name)) {
			xah(
				((MCContainerMeta) xah_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_R.class, value)
			);
			return;
		}
		if ($xad.equalsIgnoreCase(name)) {
			xad(
				((MCContainerMeta) xad_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return xa().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		xa().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return xa().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		xa().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return xa().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		xa().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return xa().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		xa().exe_sts_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return xa().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		xa().ext_sys_cd(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return xa().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return xa().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		xa().ext_data_no(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return xa().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		xa().data_make_dt(value);
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public boolean imp_flg() {
		return xa().imp_flg();
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		xa().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return xa().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		xa().recv_dt(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return xa().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		xa().xfr_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xa().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xa().trd_cd(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return xa().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		xa().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return xa().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		xa().bd_dpt_cd(value);
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public MCDate xfr_dt() {
		return xa().xfr_dt();
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public void xfr_dt(MCDate value) {
		xa().xfr_dt(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return xa().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		xa().act_dpt_cd(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return xa().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		xa().act_usr_cd(value);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return xa().xfr_alloc_sts_no();
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		xa().xfr_alloc_sts_no(value);
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public String ext_xfr_act_no() {
		return xa().ext_xfr_act_no();
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public void ext_xfr_act_no(String value) {
		xa().ext_xfr_act_no(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xa().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xa().lg_grp_cd(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return xa().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		xa().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return xa().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		xa().gi_str_ln_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xa().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xa().gr_loc_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return xa().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		xa().gr_str_ln_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return xa().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		xa().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return xa().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		xa().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return xa().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		xa().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return xa().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		xa().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return xa().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		xa().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return xa().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		xa().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return xa().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		xa().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return xa().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		xa().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return xa().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		xa().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return xa().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		xa().sno4(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return xa().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		xa().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return xa().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		xa().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return xa().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		xa().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return xa().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		xa().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return xa().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		xa().stk_bp_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return xa().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		xa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		xa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		xa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		xa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		xa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return xa().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		xa().trd_unit_cd(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return xa().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		xa().abort_flg(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return xa().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		xa().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return xa().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		xa().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return xa().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		xa().base_ac_dt(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return xa().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		xa().intr_d_rmrks(value);
	}

}

