package mcframe.clientMAUA.MAUAP1050;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public static final String $loc_mng_typ_nm = "loc_mng_typ_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public static final String $asst_dpt_cd = "asst_dpt_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Distribution standard location flg. 物流標準場所ＦＬＧ.<p>
	 *
	 */
	public static final String $lg_def_flg = "lg_def_flg";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	/**
	 * Direct-delivery supply inspection flg. 直送支給検査ＦＬＧ.<p>
	 *
	 */
	public static final String $ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * For inventory count flg. 棚卸対象ＦＬＧ.<p>
	 *
	 */
	public static final String $stktk_tgt_flg = "stktk_tgt_flg";
	/**
	 * Logical inventory initial display flg. 理論在庫初期表示ＦＬＧ.<p>
	 *
	 */
	public static final String $stktk_tor_disp_flg = "stktk_tor_disp_flg";
	/**
	 * Logical inventory qty. 0 exclusion flg. 理論在庫数０除外ＦＬＧ.<p>
	 *
	 */
	public static final String $stktk_tor_ex_zero_flg = "stktk_tor_ex_zero_flg";
	/**
	 * Inventory variance qty. 0 excluded flg. 実棚差異数０除外ＦＬＧ.<p>
	 *
	 */
	public static final String $stktk_act_ex_zero_flg = "stktk_act_ex_zero_flg";
	/**
	 * Inventory count amount output flg. 棚卸金額出力ＦＬＧ.<p>
	 *
	 */
	public static final String $stktk_amt_flg = "stktk_amt_flg";
	/**
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Allocation limited flg. 引当限定ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_lmt_flg = "alloc_lmt_flg";
	/**
	 * SKU transfer at GI flg. 出庫時荷姿振替ＦＬＧ.<p>
	 *
	 */
	public static final String $gi_pack_xfer_flg = "gi_pack_xfer_flg";
	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public static final String $gi_vmi_flg = "gi_vmi_flg";
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public static final String $ext_sys_loc_typ = "ext_sys_loc_typ";
	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public static final String $loc_alc_grp = "loc_alc_grp";
	/**
	 * Address setting flg. 住所設定ＦＬＧ.<p>
	 *
	 */
	public static final String $addr_flg = "addr_flg";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Without rack/line flg. 棚・ライン無ＦＬＧ.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta loc_mng_typ_nm_META = createCommonMeta($loc_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta asst_dpt_cd_META = createCommonMeta($asst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta lg_def_flg_META = createCommonMeta($lg_def_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ddlv_prov_insp_flg_META = createCommonMeta($ddlv_prov_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta stktk_tgt_flg_META = createCommonMeta($stktk_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_tor_disp_flg_META = createCommonMeta($stktk_tor_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_tor_ex_zero_flg_META = createCommonMeta($stktk_tor_ex_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_act_ex_zero_flg_META = createCommonMeta($stktk_act_ex_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_amt_flg_META = createCommonMeta($stktk_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_lmt_flg_META = createCommonMeta($alloc_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_pack_xfer_flg_META = createCommonMeta($gi_pack_xfer_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_vmi_flg_META = createCommonMeta($gi_vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta ext_sys_loc_typ_META = createCommonMeta($ext_sys_loc_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_LOC_TYP);
	public static final MCMeta loc_alc_grp_META = createCommonMeta($loc_alc_grp, mcframe.commonMA.meta.MA_META.LOC_ALC_GRP);
	public static final MCMeta addr_flg_META = createCommonMeta($addr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			loc_mng_typ_META,
			loc_mng_typ_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_ts_META,
			upd_ts_META,
			asst_dpt_cd_META,
			sls_dpt_cd_META,
			lg_def_flg_META,
			maker_cd_META,
			pre_outsrc_act_flg_META,
			ddlv_prov_insp_flg_META,
			cal_cd_META,
			stktk_tgt_flg_META,
			stktk_tor_disp_flg_META,
			stktk_tor_ex_zero_flg_META,
			stktk_act_ex_zero_flg_META,
			stktk_amt_flg_META,
			str_ln_tgt_flg_META,
			alloc_lmt_flg_META,
			gi_pack_xfer_flg_META,
			gi_vmi_flg_META,
			rsrc_cd1_META,
			rsrc_cd2_META,
			ext_sys_loc_typ_META,
			loc_alc_grp_META,
			addr_flg_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			str_ln_cd_META,
			str_ln_cd_none_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[FLG_GRP]のキー定数 */
	public static final String $$FLG_GRP = "FLG_GRP";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$FLG_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"}	// loc_grp_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 2, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 2, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 3, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 3, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 4, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 4, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 6, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 6, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 7, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 7, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 8, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 8, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 9, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 9, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 10, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 10, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 11, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 11, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 12, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 12, $loc_grp_nm, value);
	}


	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 13, $loc_mng_typ);
	}

	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 13, $loc_mng_typ, value);
	}


	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public String loc_mng_typ_nm() {
		return getConstString(offset + 14, $loc_mng_typ_nm);
	}

	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public void loc_mng_typ_nm(String value) {
		setConstString(offset + 14, $loc_mng_typ_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 15, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 15, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 16, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 16, $sppl_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 17, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 17, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 18, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 18, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 19, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 19, $memo3, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 20, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 20, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 21, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 21, $upd_ts, value);
	}


	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public String asst_dpt_cd() {
		return getConstString(offset + 22, $asst_dpt_cd);
	}

	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public void asst_dpt_cd(String value) {
		setConstString(offset + 22, $asst_dpt_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 23, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 23, $sls_dpt_cd, value);
	}


	/**
	 * Distribution standard location flg. 物流標準場所ＦＬＧ.<p>
	 *
	 */
	public boolean lg_def_flg() {
		return getConstBoolean(offset + 24, $lg_def_flg);
	}

	/**
	 * Distribution standard location flg. 物流標準場所ＦＬＧ.<p>
	 *
	 */
	public void lg_def_flg(boolean value) {
		setConstBoolean(offset + 24, $lg_def_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 25, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 25, $maker_cd, value);
	}


	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 26, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 26, $pre_outsrc_act_flg, value);
	}


	/**
	 * Direct-delivery supply inspection flg. 直送支給検査ＦＬＧ.<p>
	 *
	 */
	public boolean ddlv_prov_insp_flg() {
		return getConstBoolean(offset + 27, $ddlv_prov_insp_flg);
	}

	/**
	 * Direct-delivery supply inspection flg. 直送支給検査ＦＬＧ.<p>
	 *
	 */
	public void ddlv_prov_insp_flg(boolean value) {
		setConstBoolean(offset + 27, $ddlv_prov_insp_flg, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 28, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 28, $cal_cd, value);
	}


	/**
	 * For inventory count flg. 棚卸対象ＦＬＧ.<p>
	 *
	 */
	public boolean stktk_tgt_flg() {
		return getConstBoolean(offset + 29, $stktk_tgt_flg);
	}

	/**
	 * For inventory count flg. 棚卸対象ＦＬＧ.<p>
	 *
	 */
	public void stktk_tgt_flg(boolean value) {
		setConstBoolean(offset + 29, $stktk_tgt_flg, value);
	}


	/**
	 * Logical inventory initial display flg. 理論在庫初期表示ＦＬＧ.<p>
	 *
	 */
	public boolean stktk_tor_disp_flg() {
		return getConstBoolean(offset + 30, $stktk_tor_disp_flg);
	}

	/**
	 * Logical inventory initial display flg. 理論在庫初期表示ＦＬＧ.<p>
	 *
	 */
	public void stktk_tor_disp_flg(boolean value) {
		setConstBoolean(offset + 30, $stktk_tor_disp_flg, value);
	}


	/**
	 * Logical inventory qty. 0 exclusion flg. 理論在庫数０除外ＦＬＧ.<p>
	 *
	 */
	public boolean stktk_tor_ex_zero_flg() {
		return getConstBoolean(offset + 31, $stktk_tor_ex_zero_flg);
	}

	/**
	 * Logical inventory qty. 0 exclusion flg. 理論在庫数０除外ＦＬＧ.<p>
	 *
	 */
	public void stktk_tor_ex_zero_flg(boolean value) {
		setConstBoolean(offset + 31, $stktk_tor_ex_zero_flg, value);
	}


	/**
	 * Inventory variance qty. 0 excluded flg. 実棚差異数０除外ＦＬＧ.<p>
	 *
	 */
	public boolean stktk_act_ex_zero_flg() {
		return getConstBoolean(offset + 32, $stktk_act_ex_zero_flg);
	}

	/**
	 * Inventory variance qty. 0 excluded flg. 実棚差異数０除外ＦＬＧ.<p>
	 *
	 */
	public void stktk_act_ex_zero_flg(boolean value) {
		setConstBoolean(offset + 32, $stktk_act_ex_zero_flg, value);
	}


	/**
	 * Inventory count amount output flg. 棚卸金額出力ＦＬＧ.<p>
	 *
	 */
	public boolean stktk_amt_flg() {
		return getConstBoolean(offset + 33, $stktk_amt_flg);
	}

	/**
	 * Inventory count amount output flg. 棚卸金額出力ＦＬＧ.<p>
	 *
	 */
	public void stktk_amt_flg(boolean value) {
		setConstBoolean(offset + 33, $stktk_amt_flg, value);
	}


	/**
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 34, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 34, $str_ln_tgt_flg, value);
	}


	/**
	 * Allocation limited flg. 引当限定ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_lmt_flg() {
		return getConstBoolean(offset + 35, $alloc_lmt_flg);
	}

	/**
	 * Allocation limited flg. 引当限定ＦＬＧ.<p>
	 *
	 */
	public void alloc_lmt_flg(boolean value) {
		setConstBoolean(offset + 35, $alloc_lmt_flg, value);
	}


	/**
	 * SKU transfer at GI flg. 出庫時荷姿振替ＦＬＧ.<p>
	 *
	 */
	public boolean gi_pack_xfer_flg() {
		return getConstBoolean(offset + 36, $gi_pack_xfer_flg);
	}

	/**
	 * SKU transfer at GI flg. 出庫時荷姿振替ＦＬＧ.<p>
	 *
	 */
	public void gi_pack_xfer_flg(boolean value) {
		setConstBoolean(offset + 36, $gi_pack_xfer_flg, value);
	}


	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public boolean gi_vmi_flg() {
		return getConstBoolean(offset + 37, $gi_vmi_flg);
	}

	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public void gi_vmi_flg(boolean value) {
		setConstBoolean(offset + 37, $gi_vmi_flg, value);
	}


	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 38, $rsrc_cd1);
	}

	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 38, $rsrc_cd1, value);
	}


	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 39, $rsrc_cd2);
	}

	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 39, $rsrc_cd2, value);
	}


	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public String ext_sys_loc_typ() {
		return getConstString(offset + 40, $ext_sys_loc_typ);
	}

	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public void ext_sys_loc_typ(String value) {
		setConstString(offset + 40, $ext_sys_loc_typ, value);
	}


	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public String loc_alc_grp() {
		return getConstString(offset + 41, $loc_alc_grp);
	}

	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public void loc_alc_grp(String value) {
		setConstString(offset + 41, $loc_alc_grp, value);
	}


	/**
	 * Address setting flg. 住所設定ＦＬＧ.<p>
	 *
	 */
	public boolean addr_flg() {
		return getConstBoolean(offset + 42, $addr_flg);
	}

	/**
	 * Address setting flg. 住所設定ＦＬＧ.<p>
	 *
	 */
	public void addr_flg(boolean value) {
		setConstBoolean(offset + 42, $addr_flg, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 43, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 43, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 44, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 44, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 45, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 45, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 46, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 46, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 47, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 47, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 48, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 48, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 49, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 49, $fax, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 50, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 50, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 51, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 51, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 52, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 52, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 53, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 53, $itm_sub3, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 54, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 54, $str_ln_cd, value);
	}


	/**
	 * Without rack/line flg. 棚・ライン無ＦＬＧ.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 55, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line flg. 棚・ライン無ＦＬＧ.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 55, $str_ln_cd_none_flg, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			return loc_mng_typ_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			return asst_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		return super.getString(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			return lg_def_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			return ddlv_prov_insp_flg();
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			return stktk_tgt_flg();
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			return stktk_tor_disp_flg();
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_tor_ex_zero_flg();
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_act_ex_zero_flg();
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			return stktk_amt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			return alloc_lmt_flg();
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			return gi_pack_xfer_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			return addr_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			return loc_mng_typ_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			return asst_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		return super.getStringNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			return lg_def_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			return ddlv_prov_insp_flg();
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			return stktk_tgt_flg();
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			return stktk_tor_disp_flg();
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_tor_ex_zero_flg();
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_act_ex_zero_flg();
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			return stktk_amt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			return alloc_lmt_flg();
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			return gi_pack_xfer_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			return addr_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			loc_mng_typ_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			asst_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			ext_sys_loc_typ(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			lg_def_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			ddlv_prov_insp_flg(value);
			return;
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			stktk_tgt_flg(value);
			return;
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			stktk_tor_disp_flg(value);
			return;
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_tor_ex_zero_flg(value);
			return;
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_act_ex_zero_flg(value);
			return;
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			stktk_amt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			alloc_lmt_flg(value);
			return;
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			gi_pack_xfer_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			addr_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			loc_mng_typ_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			asst_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			ext_sys_loc_typ(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			lg_def_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			ddlv_prov_insp_flg(value);
			return;
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			stktk_tgt_flg(value);
			return;
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			stktk_tor_disp_flg(value);
			return;
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_tor_ex_zero_flg(value);
			return;
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_act_ex_zero_flg(value);
			return;
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			stktk_amt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			alloc_lmt_flg(value);
			return;
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			gi_pack_xfer_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			addr_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

