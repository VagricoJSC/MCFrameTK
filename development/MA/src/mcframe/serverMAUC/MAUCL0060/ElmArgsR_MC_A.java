package mcframe.serverMAUC.MAUCL0060;

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
 * ブロック"ElmArgs"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ElmArgsR_MC_A extends MCConstRow {

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Child item lot No. 子品目ロットＮＯ.<p>
	 *
	 */
	public static final String $chd_lot_no = "chd_lot_no";
	/**
	 * Child item sublot No. 子品目サブロットＮＯ.<p>
	 *
	 */
	public static final String $chd_sublot_no = "chd_sublot_no";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Date 日付.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * String 文字列.<p>
	 *
	 */
	public static final String $str = "str";
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public static final String $str2 = "str2";
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public static final String $str3 = "str3";
	/**
	 * Number 数字.<p>
	 *
	 */
	public static final String $num = "num";
	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Number 番号.<p>
	 *
	 */
	public static final String $new_no = "new_no";
	/**
	 * Item cd._label name 品目ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $itm_cd_label_nm = "itm_cd_label_nm";
	/**
	 * Branch No. 1_label name 枝番１_ラベル名.<p>
	 *
	 */
	public static final String $itm_sub1_label_nm = "itm_sub1_label_nm";
	/**
	 * Branch No. 2_label name 枝番２_ラベル名.<p>
	 *
	 */
	public static final String $itm_sub2_label_nm = "itm_sub2_label_nm";
	/**
	 * Branch No. 3_label name 枝番３_ラベル名.<p>
	 *
	 */
	public static final String $itm_sub3_label_nm = "itm_sub3_label_nm";
	/**
	 * Location cd._label name 場所ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $loc_cd_label_nm = "loc_cd_label_nm";
	/**
	 * Dept. cd._label name 部門ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $dpt_cd_label_nm = "dpt_cd_label_nm";
	/**
	 * Company cd._label name 会社ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $co_cd_label_nm = "co_cd_label_nm";
	/**
	 * BP cd._label name 取引先ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $bp_cd_label_nm = "bp_cd_label_nm";
	/**
	 * WG cd._label name ワーキンググループＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $wg_cd_label_nm = "wg_cd_label_nm";
	/**
	 * Factory/Distribution warehouse cd._label name 工場・物流倉庫ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $site_cd_label_nm = "site_cd_label_nm";
	/**
	 * Lot No._label name ロットＮＯ_ラベル名.<p>
	 *
	 */
	public static final String $lot_no_label_nm = "lot_no_label_nm";
	/**
	 * Child item lot No._label name 子品目ロットＮＯ_ラベル名.<p>
	 *
	 */
	public static final String $chd_lot_no_label_nm = "chd_lot_no_label_nm";
	/**
	 * Child item sublot No._label name 子品目サブロットＮＯ_ラベル名.<p>
	 *
	 */
	public static final String $chd_sublot_no_label_nm = "chd_sublot_no_label_nm";
	/**
	 * Vendor Lot No._label name 業者ロットＮＯ_ラベル名.<p>
	 *
	 */
	public static final String $bp_lot_no_label_nm = "bp_lot_no_label_nm";
	/**
	 * SEIBAN No. 1_label name 手配ＮＯ１_ラベル名.<p>
	 *
	 */
	public static final String $sno1_label_nm = "sno1_label_nm";
	/**
	 * SEIBAN No. 2_label name 手配ＮＯ２_ラベル名.<p>
	 *
	 */
	public static final String $sno2_label_nm = "sno2_label_nm";
	/**
	 * SEIBAN No. 3_label name 手配ＮＯ３_ラベル名.<p>
	 *
	 */
	public static final String $sno3_label_nm = "sno3_label_nm";
	/**
	 * SEIBAN No. 4_label name 手配ＮＯ４_ラベル名.<p>
	 *
	 */
	public static final String $sno4_label_nm = "sno4_label_nm";
	/**
	 * Transaction cd._label name 取引ＣＤ_ラベル名.<p>
	 *
	 */
	public static final String $trd_cd_label_nm = "trd_cd_label_nm";
	/**
	 * Date_label name 日付_ラベル名.<p>
	 *
	 */
	public static final String $dt_label_nm = "dt_label_nm";
	/**
	 * String_label name 文字列_ラベル名.<p>
	 *
	 */
	public static final String $str_label_nm = "str_label_nm";
	/**
	 * String 2_label name 文字列２_ラベル名.<p>
	 *
	 */
	public static final String $str2_label_nm = "str2_label_nm";
	/**
	 * String 3_label name 文字列３_ラベル名.<p>
	 *
	 */
	public static final String $str3_label_nm = "str3_label_nm";
	/**
	 * Number_label name 数字_ラベル名.<p>
	 *
	 */
	public static final String $num_label_nm = "num_label_nm";


	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta str_META = createCommonMeta($str, mcframe.commonMA.meta.MA_META.NUM_STR);
	public static final MCMeta str2_META = createCommonMeta($str2, mcframe.commonMA.meta.MA_META.NUM_STR);
	public static final MCMeta str3_META = createCommonMeta($str3, mcframe.commonMA.meta.MA_META.NUM_STR);
	public static final MCMeta num_META = createCommonMeta($num, mcframe.commonMA.meta.MA_META.NUM_NUMBER);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta new_no_META = createCommonMeta($new_no, mcframe.commonMA.meta.MA_META.NUMBERING);
	public static final MCMeta itm_cd_label_nm_META = createCommonMeta($itm_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta itm_sub1_label_nm_META = createCommonMeta($itm_sub1_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta itm_sub2_label_nm_META = createCommonMeta($itm_sub2_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta itm_sub3_label_nm_META = createCommonMeta($itm_sub3_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta loc_cd_label_nm_META = createCommonMeta($loc_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta dpt_cd_label_nm_META = createCommonMeta($dpt_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta co_cd_label_nm_META = createCommonMeta($co_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta bp_cd_label_nm_META = createCommonMeta($bp_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta wg_cd_label_nm_META = createCommonMeta($wg_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta site_cd_label_nm_META = createCommonMeta($site_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta lot_no_label_nm_META = createCommonMeta($lot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta chd_lot_no_label_nm_META = createCommonMeta($chd_lot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta chd_sublot_no_label_nm_META = createCommonMeta($chd_sublot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta bp_lot_no_label_nm_META = createCommonMeta($bp_lot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno1_label_nm_META = createCommonMeta($sno1_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno2_label_nm_META = createCommonMeta($sno2_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno3_label_nm_META = createCommonMeta($sno3_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno4_label_nm_META = createCommonMeta($sno4_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta trd_cd_label_nm_META = createCommonMeta($trd_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta dt_label_nm_META = createCommonMeta($dt_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta str_label_nm_META = createCommonMeta($str_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta str2_label_nm_META = createCommonMeta($str2_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta str3_label_nm_META = createCommonMeta($str3_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta num_label_nm_META = createCommonMeta($num_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);

	protected static final ConstMetaList<ElmArgsR> constMetas = new ConstMetaList<ElmArgsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			num_ptn_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			dpt_cd_META,
			co_cd_META,
			bp_cd_META,
			wg_cd_META,
			trd_cd_META,
			site_cd_META,
			lot_no_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			bp_lot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			dt_META,
			str_META,
			str2_META,
			str3_META,
			num_META,
			peg_no_META,
			new_no_META,
			itm_cd_label_nm_META,
			itm_sub1_label_nm_META,
			itm_sub2_label_nm_META,
			itm_sub3_label_nm_META,
			loc_cd_label_nm_META,
			dpt_cd_label_nm_META,
			co_cd_label_nm_META,
			bp_cd_label_nm_META,
			wg_cd_label_nm_META,
			site_cd_label_nm_META,
			lot_no_label_nm_META,
			chd_lot_no_label_nm_META,
			chd_sublot_no_label_nm_META,
			bp_lot_no_label_nm_META,
			sno1_label_nm_META,
			sno2_label_nm_META,
			sno3_label_nm_META,
			sno4_label_nm_META,
			trd_cd_label_nm_META,
			dt_label_nm_META,
			str_label_nm_META,
			str2_label_nm_META,
			str3_label_nm_META,
			num_label_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected ElmArgsR_MC_A(ConstMetaList<? extends ElmArgsR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ElmArgsR clone() {
		return (ElmArgsR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ElmArgsR createInstance() {
		return (ElmArgsR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ElmArgsR getValues(String... names) {
		return (ElmArgsR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 0, $num_ptn_cd);
	}

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 0, $num_ptn_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 5, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 5, $loc_cd, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 6, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 6, $dpt_cd, value);
	}


	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 7, $co_cd);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 7, $co_cd, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 8, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 8, $bp_cd, value);
	}


	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 12, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 12, $lot_no, value);
	}


	/**
	 * Child item lot No. 子品目ロットＮＯ.<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 13, $chd_lot_no);
	}

	/**
	 * Child item lot No. 子品目ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 13, $chd_lot_no, value);
	}


	/**
	 * Child item sublot No. 子品目サブロットＮＯ.<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 14, $chd_sublot_no);
	}

	/**
	 * Child item sublot No. 子品目サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 14, $chd_sublot_no, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 15, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 15, $bp_lot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 16, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 16, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 17, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 17, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 18, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 18, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 19, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 19, $sno4, value);
	}


	/**
	 * Date 日付.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 20, $dt);
	}

	/**
	 * Date 日付.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 20, $dt, value);
	}


	/**
	 * String 文字列.<p>
	 *
	 */
	public String str() {
		return getConstString(offset + 21, $str);
	}

	/**
	 * String 文字列.<p>
	 *
	 */
	public void str(String value) {
		setConstString(offset + 21, $str, value);
	}


	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public String str2() {
		return getConstString(offset + 22, $str2);
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public void str2(String value) {
		setConstString(offset + 22, $str2, value);
	}


	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public String str3() {
		return getConstString(offset + 23, $str3);
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public void str3(String value) {
		setConstString(offset + 23, $str3, value);
	}


	/**
	 * Number 数字.<p>
	 *
	 */
	public MCNumber num() {
		return getConstNumber(offset + 24, $num);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(MCNumber value) {
		setConstNumber(offset + 24, $num, value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(int value) {
		setConstNumber(offset + 24, $num, value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(long value) {
		setConstNumber(offset + 24, $num, value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(float value) {
		setConstNumber(offset + 24, $num, value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(double value) {
		setConstNumber(offset + 24, $num, value);
	}


	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 25, $peg_no);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 25, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 25, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 25, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 25, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 25, $peg_no, value);
	}


	/**
	 * Number 番号.<p>
	 *
	 */
	public String new_no() {
		return getConstString(offset + 26, $new_no);
	}

	/**
	 * Number 番号.<p>
	 *
	 */
	public void new_no(String value) {
		setConstString(offset + 26, $new_no, value);
	}


	/**
	 * Item cd._label name 品目ＣＤ_ラベル名.<p>
	 *
	 */
	public String itm_cd_label_nm() {
		return getConstString(offset + 27, $itm_cd_label_nm);
	}

	/**
	 * Item cd._label name 品目ＣＤ_ラベル名.<p>
	 *
	 */
	public void itm_cd_label_nm(String value) {
		setConstString(offset + 27, $itm_cd_label_nm, value);
	}


	/**
	 * Branch No. 1_label name 枝番１_ラベル名.<p>
	 *
	 */
	public String itm_sub1_label_nm() {
		return getConstString(offset + 28, $itm_sub1_label_nm);
	}

	/**
	 * Branch No. 1_label name 枝番１_ラベル名.<p>
	 *
	 */
	public void itm_sub1_label_nm(String value) {
		setConstString(offset + 28, $itm_sub1_label_nm, value);
	}


	/**
	 * Branch No. 2_label name 枝番２_ラベル名.<p>
	 *
	 */
	public String itm_sub2_label_nm() {
		return getConstString(offset + 29, $itm_sub2_label_nm);
	}

	/**
	 * Branch No. 2_label name 枝番２_ラベル名.<p>
	 *
	 */
	public void itm_sub2_label_nm(String value) {
		setConstString(offset + 29, $itm_sub2_label_nm, value);
	}


	/**
	 * Branch No. 3_label name 枝番３_ラベル名.<p>
	 *
	 */
	public String itm_sub3_label_nm() {
		return getConstString(offset + 30, $itm_sub3_label_nm);
	}

	/**
	 * Branch No. 3_label name 枝番３_ラベル名.<p>
	 *
	 */
	public void itm_sub3_label_nm(String value) {
		setConstString(offset + 30, $itm_sub3_label_nm, value);
	}


	/**
	 * Location cd._label name 場所ＣＤ_ラベル名.<p>
	 *
	 */
	public String loc_cd_label_nm() {
		return getConstString(offset + 31, $loc_cd_label_nm);
	}

	/**
	 * Location cd._label name 場所ＣＤ_ラベル名.<p>
	 *
	 */
	public void loc_cd_label_nm(String value) {
		setConstString(offset + 31, $loc_cd_label_nm, value);
	}


	/**
	 * Dept. cd._label name 部門ＣＤ_ラベル名.<p>
	 *
	 */
	public String dpt_cd_label_nm() {
		return getConstString(offset + 32, $dpt_cd_label_nm);
	}

	/**
	 * Dept. cd._label name 部門ＣＤ_ラベル名.<p>
	 *
	 */
	public void dpt_cd_label_nm(String value) {
		setConstString(offset + 32, $dpt_cd_label_nm, value);
	}


	/**
	 * Company cd._label name 会社ＣＤ_ラベル名.<p>
	 *
	 */
	public String co_cd_label_nm() {
		return getConstString(offset + 33, $co_cd_label_nm);
	}

	/**
	 * Company cd._label name 会社ＣＤ_ラベル名.<p>
	 *
	 */
	public void co_cd_label_nm(String value) {
		setConstString(offset + 33, $co_cd_label_nm, value);
	}


	/**
	 * BP cd._label name 取引先ＣＤ_ラベル名.<p>
	 *
	 */
	public String bp_cd_label_nm() {
		return getConstString(offset + 34, $bp_cd_label_nm);
	}

	/**
	 * BP cd._label name 取引先ＣＤ_ラベル名.<p>
	 *
	 */
	public void bp_cd_label_nm(String value) {
		setConstString(offset + 34, $bp_cd_label_nm, value);
	}


	/**
	 * WG cd._label name ワーキンググループＣＤ_ラベル名.<p>
	 *
	 */
	public String wg_cd_label_nm() {
		return getConstString(offset + 35, $wg_cd_label_nm);
	}

	/**
	 * WG cd._label name ワーキンググループＣＤ_ラベル名.<p>
	 *
	 */
	public void wg_cd_label_nm(String value) {
		setConstString(offset + 35, $wg_cd_label_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd._label name 工場・物流倉庫ＣＤ_ラベル名.<p>
	 *
	 */
	public String site_cd_label_nm() {
		return getConstString(offset + 36, $site_cd_label_nm);
	}

	/**
	 * Factory/Distribution warehouse cd._label name 工場・物流倉庫ＣＤ_ラベル名.<p>
	 *
	 */
	public void site_cd_label_nm(String value) {
		setConstString(offset + 36, $site_cd_label_nm, value);
	}


	/**
	 * Lot No._label name ロットＮＯ_ラベル名.<p>
	 *
	 */
	public String lot_no_label_nm() {
		return getConstString(offset + 37, $lot_no_label_nm);
	}

	/**
	 * Lot No._label name ロットＮＯ_ラベル名.<p>
	 *
	 */
	public void lot_no_label_nm(String value) {
		setConstString(offset + 37, $lot_no_label_nm, value);
	}


	/**
	 * Child item lot No._label name 子品目ロットＮＯ_ラベル名.<p>
	 *
	 */
	public String chd_lot_no_label_nm() {
		return getConstString(offset + 38, $chd_lot_no_label_nm);
	}

	/**
	 * Child item lot No._label name 子品目ロットＮＯ_ラベル名.<p>
	 *
	 */
	public void chd_lot_no_label_nm(String value) {
		setConstString(offset + 38, $chd_lot_no_label_nm, value);
	}


	/**
	 * Child item sublot No._label name 子品目サブロットＮＯ_ラベル名.<p>
	 *
	 */
	public String chd_sublot_no_label_nm() {
		return getConstString(offset + 39, $chd_sublot_no_label_nm);
	}

	/**
	 * Child item sublot No._label name 子品目サブロットＮＯ_ラベル名.<p>
	 *
	 */
	public void chd_sublot_no_label_nm(String value) {
		setConstString(offset + 39, $chd_sublot_no_label_nm, value);
	}


	/**
	 * Vendor Lot No._label name 業者ロットＮＯ_ラベル名.<p>
	 *
	 */
	public String bp_lot_no_label_nm() {
		return getConstString(offset + 40, $bp_lot_no_label_nm);
	}

	/**
	 * Vendor Lot No._label name 業者ロットＮＯ_ラベル名.<p>
	 *
	 */
	public void bp_lot_no_label_nm(String value) {
		setConstString(offset + 40, $bp_lot_no_label_nm, value);
	}


	/**
	 * SEIBAN No. 1_label name 手配ＮＯ１_ラベル名.<p>
	 *
	 */
	public String sno1_label_nm() {
		return getConstString(offset + 41, $sno1_label_nm);
	}

	/**
	 * SEIBAN No. 1_label name 手配ＮＯ１_ラベル名.<p>
	 *
	 */
	public void sno1_label_nm(String value) {
		setConstString(offset + 41, $sno1_label_nm, value);
	}


	/**
	 * SEIBAN No. 2_label name 手配ＮＯ２_ラベル名.<p>
	 *
	 */
	public String sno2_label_nm() {
		return getConstString(offset + 42, $sno2_label_nm);
	}

	/**
	 * SEIBAN No. 2_label name 手配ＮＯ２_ラベル名.<p>
	 *
	 */
	public void sno2_label_nm(String value) {
		setConstString(offset + 42, $sno2_label_nm, value);
	}


	/**
	 * SEIBAN No. 3_label name 手配ＮＯ３_ラベル名.<p>
	 *
	 */
	public String sno3_label_nm() {
		return getConstString(offset + 43, $sno3_label_nm);
	}

	/**
	 * SEIBAN No. 3_label name 手配ＮＯ３_ラベル名.<p>
	 *
	 */
	public void sno3_label_nm(String value) {
		setConstString(offset + 43, $sno3_label_nm, value);
	}


	/**
	 * SEIBAN No. 4_label name 手配ＮＯ４_ラベル名.<p>
	 *
	 */
	public String sno4_label_nm() {
		return getConstString(offset + 44, $sno4_label_nm);
	}

	/**
	 * SEIBAN No. 4_label name 手配ＮＯ４_ラベル名.<p>
	 *
	 */
	public void sno4_label_nm(String value) {
		setConstString(offset + 44, $sno4_label_nm, value);
	}


	/**
	 * Transaction cd._label name 取引ＣＤ_ラベル名.<p>
	 *
	 */
	public String trd_cd_label_nm() {
		return getConstString(offset + 45, $trd_cd_label_nm);
	}

	/**
	 * Transaction cd._label name 取引ＣＤ_ラベル名.<p>
	 *
	 */
	public void trd_cd_label_nm(String value) {
		setConstString(offset + 45, $trd_cd_label_nm, value);
	}


	/**
	 * Date_label name 日付_ラベル名.<p>
	 *
	 */
	public String dt_label_nm() {
		return getConstString(offset + 46, $dt_label_nm);
	}

	/**
	 * Date_label name 日付_ラベル名.<p>
	 *
	 */
	public void dt_label_nm(String value) {
		setConstString(offset + 46, $dt_label_nm, value);
	}


	/**
	 * String_label name 文字列_ラベル名.<p>
	 *
	 */
	public String str_label_nm() {
		return getConstString(offset + 47, $str_label_nm);
	}

	/**
	 * String_label name 文字列_ラベル名.<p>
	 *
	 */
	public void str_label_nm(String value) {
		setConstString(offset + 47, $str_label_nm, value);
	}


	/**
	 * String 2_label name 文字列２_ラベル名.<p>
	 *
	 */
	public String str2_label_nm() {
		return getConstString(offset + 48, $str2_label_nm);
	}

	/**
	 * String 2_label name 文字列２_ラベル名.<p>
	 *
	 */
	public void str2_label_nm(String value) {
		setConstString(offset + 48, $str2_label_nm, value);
	}


	/**
	 * String 3_label name 文字列３_ラベル名.<p>
	 *
	 */
	public String str3_label_nm() {
		return getConstString(offset + 49, $str3_label_nm);
	}

	/**
	 * String 3_label name 文字列３_ラベル名.<p>
	 *
	 */
	public void str3_label_nm(String value) {
		setConstString(offset + 49, $str3_label_nm, value);
	}


	/**
	 * Number_label name 数字_ラベル名.<p>
	 *
	 */
	public String num_label_nm() {
		return getConstString(offset + 50, $num_label_nm);
	}

	/**
	 * Number_label name 数字_ラベル名.<p>
	 *
	 */
	public void num_label_nm(String value) {
		setConstString(offset + 50, $num_label_nm, value);
	}


	public String getString(String name) {
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($str.equalsIgnoreCase(name)) {
			return str();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
		}
		if ($new_no.equalsIgnoreCase(name)) {
			return new_no();
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			return itm_cd_label_nm();
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			return itm_sub1_label_nm();
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			return itm_sub2_label_nm();
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			return itm_sub3_label_nm();
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			return loc_cd_label_nm();
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			return dpt_cd_label_nm();
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			return co_cd_label_nm();
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			return bp_cd_label_nm();
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			return wg_cd_label_nm();
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			return site_cd_label_nm();
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			return lot_no_label_nm();
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_lot_no_label_nm();
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_sublot_no_label_nm();
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			return bp_lot_no_label_nm();
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			return sno1_label_nm();
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			return sno2_label_nm();
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			return sno3_label_nm();
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			return sno4_label_nm();
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			return trd_cd_label_nm();
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			return dt_label_nm();
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			return str_label_nm();
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			return str2_label_nm();
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			return str3_label_nm();
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			return num_label_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($num.equalsIgnoreCase(name)) {
			return num();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($str.equalsIgnoreCase(name)) {
			return str();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
		}
		if ($new_no.equalsIgnoreCase(name)) {
			return new_no();
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			return itm_cd_label_nm();
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			return itm_sub1_label_nm();
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			return itm_sub2_label_nm();
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			return itm_sub3_label_nm();
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			return loc_cd_label_nm();
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			return dpt_cd_label_nm();
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			return co_cd_label_nm();
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			return bp_cd_label_nm();
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			return wg_cd_label_nm();
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			return site_cd_label_nm();
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			return lot_no_label_nm();
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_lot_no_label_nm();
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_sublot_no_label_nm();
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			return bp_lot_no_label_nm();
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			return sno1_label_nm();
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			return sno2_label_nm();
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			return sno3_label_nm();
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			return sno4_label_nm();
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			return trd_cd_label_nm();
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			return dt_label_nm();
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			return str_label_nm();
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			return str2_label_nm();
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			return str3_label_nm();
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			return num_label_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($num.equalsIgnoreCase(name)) {
			return num();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($str.equalsIgnoreCase(name)) {
			str(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
			return;
		}
		if ($new_no.equalsIgnoreCase(name)) {
			new_no(value);
			return;
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			itm_cd_label_nm(value);
			return;
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			itm_sub1_label_nm(value);
			return;
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			itm_sub2_label_nm(value);
			return;
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			itm_sub3_label_nm(value);
			return;
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			loc_cd_label_nm(value);
			return;
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			dpt_cd_label_nm(value);
			return;
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			co_cd_label_nm(value);
			return;
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			bp_cd_label_nm(value);
			return;
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			wg_cd_label_nm(value);
			return;
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			site_cd_label_nm(value);
			return;
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			lot_no_label_nm(value);
			return;
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			chd_lot_no_label_nm(value);
			return;
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			chd_sublot_no_label_nm(value);
			return;
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			bp_lot_no_label_nm(value);
			return;
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			sno1_label_nm(value);
			return;
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			sno2_label_nm(value);
			return;
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			sno3_label_nm(value);
			return;
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			sno4_label_nm(value);
			return;
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			trd_cd_label_nm(value);
			return;
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			dt_label_nm(value);
			return;
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			str_label_nm(value);
			return;
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			str2_label_nm(value);
			return;
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			str3_label_nm(value);
			return;
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			num_label_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($str.equalsIgnoreCase(name)) {
			str(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
			return;
		}
		if ($new_no.equalsIgnoreCase(name)) {
			new_no(value);
			return;
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			itm_cd_label_nm(value);
			return;
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			itm_sub1_label_nm(value);
			return;
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			itm_sub2_label_nm(value);
			return;
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			itm_sub3_label_nm(value);
			return;
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			loc_cd_label_nm(value);
			return;
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			dpt_cd_label_nm(value);
			return;
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			co_cd_label_nm(value);
			return;
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			bp_cd_label_nm(value);
			return;
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			wg_cd_label_nm(value);
			return;
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			site_cd_label_nm(value);
			return;
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			lot_no_label_nm(value);
			return;
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			chd_lot_no_label_nm(value);
			return;
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			chd_sublot_no_label_nm(value);
			return;
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			bp_lot_no_label_nm(value);
			return;
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			sno1_label_nm(value);
			return;
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			sno2_label_nm(value);
			return;
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			sno3_label_nm(value);
			return;
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			sno4_label_nm(value);
			return;
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			trd_cd_label_nm(value);
			return;
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			dt_label_nm(value);
			return;
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			str_label_nm(value);
			return;
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			str2_label_nm(value);
			return;
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			str3_label_nm(value);
			return;
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			num_label_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

