package mcframe.clientMSUA.MSUAP1060;

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
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 * Receiving point identification alias name 1 送付先識別別名１.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm1 = "ship_to_id_alt_nm1";
	/**
	 * Receiving point identification alias name 2 送付先識別別名２.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm2 = "ship_to_id_alt_nm2";
	/**
	 * Receiving point identification alias name 3 送付先識別別名３.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm3 = "ship_to_id_alt_nm3";
	/**
	 * Receiving point identification alias name 4 送付先識別別名４.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm4 = "ship_to_id_alt_nm4";
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
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Miscellaneous receiving point flg. 送付先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
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
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public static final String $ship_to_cntct_dpt = "ship_to_cntct_dpt";
	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn = "ship_to_cntct_psn";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_id_alt_nm1_META = createCommonMeta($ship_to_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta ship_to_id_alt_nm2_META = createCommonMeta($ship_to_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta ship_to_id_alt_nm3_META = createCommonMeta($ship_to_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta ship_to_id_alt_nm4_META = createCommonMeta($ship_to_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_cntct_dpt_META = createCommonMeta($ship_to_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta ship_to_cntct_psn_META = createCommonMeta($ship_to_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_id_alt_nm1_META,
			ship_to_id_alt_nm2_META,
			ship_to_id_alt_nm3_META,
			ship_to_id_alt_nm4_META,
			site_cd_META,
			site_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			str_ln_tgt_flg_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			cntry_cd_META,
			cntry_nm_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			ship_to_cntct_dpt_META,
			ship_to_cntct_psn_META,
			pri_prnt_flg_META
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
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$str_ln_tgt_flg, "STR_LN"}	// str_ln_tgt_flg
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
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 1, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 1, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 2, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 2, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 3, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 3, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 4, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 4, $ship_to_id_nm, value);
	}


	/**
	 * Receiving point identification alias name 1 送付先識別別名１.<p>
	 *
	 */
	public String ship_to_id_alt_nm1() {
		return getConstString(offset + 5, $ship_to_id_alt_nm1);
	}

	/**
	 * Receiving point identification alias name 1 送付先識別別名１.<p>
	 *
	 */
	public void ship_to_id_alt_nm1(String value) {
		setConstString(offset + 5, $ship_to_id_alt_nm1, value);
	}


	/**
	 * Receiving point identification alias name 2 送付先識別別名２.<p>
	 *
	 */
	public String ship_to_id_alt_nm2() {
		return getConstString(offset + 6, $ship_to_id_alt_nm2);
	}

	/**
	 * Receiving point identification alias name 2 送付先識別別名２.<p>
	 *
	 */
	public void ship_to_id_alt_nm2(String value) {
		setConstString(offset + 6, $ship_to_id_alt_nm2, value);
	}


	/**
	 * Receiving point identification alias name 3 送付先識別別名３.<p>
	 *
	 */
	public String ship_to_id_alt_nm3() {
		return getConstString(offset + 7, $ship_to_id_alt_nm3);
	}

	/**
	 * Receiving point identification alias name 3 送付先識別別名３.<p>
	 *
	 */
	public void ship_to_id_alt_nm3(String value) {
		setConstString(offset + 7, $ship_to_id_alt_nm3, value);
	}


	/**
	 * Receiving point identification alias name 4 送付先識別別名４.<p>
	 *
	 */
	public String ship_to_id_alt_nm4() {
		return getConstString(offset + 8, $ship_to_id_alt_nm4);
	}

	/**
	 * Receiving point identification alias name 4 送付先識別別名４.<p>
	 *
	 */
	public void ship_to_id_alt_nm4(String value) {
		setConstString(offset + 8, $ship_to_id_alt_nm4, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 9, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 9, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 10, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 10, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 11, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 11, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 12, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 12, $lg_grp_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 13, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 13, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 14, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 14, $sppl_nm, value);
	}


	/**
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 15, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 15, $str_ln_tgt_flg, value);
	}


	/**
	 * Miscellaneous receiving point flg. 送付先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 16, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point flg. 送付先諸口ＦＬＧ.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 16, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 17, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 17, $via_dlv_typ, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 18, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 18, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 19, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 19, $cntry_nm, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 20, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 20, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 21, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 21, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 22, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 22, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 23, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 23, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 24, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 24, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 25, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 25, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 26, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 26, $fax, value);
	}


	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 27, $ship_to_cntct_dpt);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 27, $ship_to_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 28, $ship_to_cntct_psn);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 28, $ship_to_cntct_psn, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 29, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 29, $pri_prnt_flg, value);
	}


	public String getString(String name) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
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
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
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
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

