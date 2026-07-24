package mcframe.clientMABS.MABSP0650;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	public static final String $dt_p = "dt_p";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
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
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cst_grp_cd1 = "cst_grp_cd1";
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public static final String $cst_grp_nm1 = "cst_grp_nm1";
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cst_grp_cd2 = "cst_grp_cd2";
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public static final String $cst_grp_nm2 = "cst_grp_nm2";
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cst_grp_cd3 = "cst_grp_cd3";
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public static final String $cst_grp_nm3 = "cst_grp_nm3";
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cst_grp_cd4 = "cst_grp_cd4";
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public static final String $cst_grp_nm4 = "cst_grp_nm4";
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cst_grp_cd5 = "cst_grp_cd5";
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public static final String $cst_grp_nm5 = "cst_grp_nm5";
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cst_grp_cd6 = "cst_grp_cd6";
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public static final String $cst_grp_nm6 = "cst_grp_nm6";
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cst_grp_cd7 = "cst_grp_cd7";
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public static final String $cst_grp_nm7 = "cst_grp_nm7";
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cst_grp_cd8 = "cst_grp_cd8";
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public static final String $cst_grp_nm8 = "cst_grp_nm8";
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cst_grp_cd9 = "cst_grp_cd9";
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public static final String $cst_grp_nm9 = "cst_grp_nm9";
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cst_grp_cd10 = "cst_grp_cd10";
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public static final String $cst_grp_nm10 = "cst_grp_nm10";

	public static final String $st_dt_fr = $dt_p + ".st_dt_fr";
	public static final String $st_dt_to = $dt_p + ".st_dt_to";
	public static final String $end_dt_fr = $dt_p + ".end_dt_fr";
	public static final String $end_dt_to = $dt_p + ".end_dt_to";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP0020.StEndDtR.class);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd1_META = createCommonMeta($cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm1_META = createCommonMeta($cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd2_META = createCommonMeta($cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm2_META = createCommonMeta($cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd3_META = createCommonMeta($cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm3_META = createCommonMeta($cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd4_META = createCommonMeta($cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm4_META = createCommonMeta($cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd5_META = createCommonMeta($cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm5_META = createCommonMeta($cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd6_META = createCommonMeta($cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm6_META = createCommonMeta($cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd7_META = createCommonMeta($cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm7_META = createCommonMeta($cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd8_META = createCommonMeta($cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm8_META = createCommonMeta($cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd9_META = createCommonMeta($cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm9_META = createCommonMeta($cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd10_META = createCommonMeta($cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm10_META = createCommonMeta($cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			dt_p_META,
			usr_cd_META,
			usr_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			cst_cd_META,
			cst_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META,
			cst_grp_cd1_META,
			cst_grp_nm1_META,
			cst_grp_cd2_META,
			cst_grp_nm2_META,
			cst_grp_cd3_META,
			cst_grp_nm3_META,
			cst_grp_cd4_META,
			cst_grp_nm4_META,
			cst_grp_cd5_META,
			cst_grp_nm5_META,
			cst_grp_cd6_META,
			cst_grp_nm6_META,
			cst_grp_cd7_META,
			cst_grp_nm7_META,
			cst_grp_cd8_META,
			cst_grp_nm8_META,
			cst_grp_cd9_META,
			cst_grp_nm9_META,
			cst_grp_cd10_META,
			cst_grp_nm10_META
		},
		new String[][]{
			{
				"st_dt_fr",
				"st_dt_to",
				"end_dt_fr",
				"end_dt_to"
			},
			{
				$st_dt_fr,
				$st_dt_to,
				$end_dt_fr,
				$end_dt_to
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_nm"},	// cst_cd
				{$cst_grp_cd1, "bp_grp_nm"},	// cst_grp_cd1
				{$cst_grp_cd2, "bp_grp_nm"},	// cst_grp_cd2
				{$cst_grp_cd3, "bp_grp_nm"},	// cst_grp_cd3
				{$cst_grp_cd4, "bp_grp_nm"},	// cst_grp_cd4
				{$cst_grp_cd5, "bp_grp_nm"},	// cst_grp_cd5
				{$cst_grp_cd6, "bp_grp_nm"},	// cst_grp_cd6
				{$cst_grp_cd7, "bp_grp_nm"},	// cst_grp_cd7
				{$cst_grp_cd8, "bp_grp_nm"},	// cst_grp_cd8
				{$cst_grp_cd9, "bp_grp_nm"},	// cst_grp_cd9
				{$cst_grp_cd10, "bp_grp_nm"}	// cst_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true;true"},	// dpt_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"},	// dpt_cd
				{$cst_cd, "bp_is_srch_typ"}	// cst_cd
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0020.StEndDtR dt_p(){
		return (mcframe.clientMAUB.MAUBP0020.StEndDtR) getConstInnerRow(offset + 1, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		setConstInnerRow(offset + 1, $dt_p, row);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 2, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 2, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 3, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 3, $usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 6, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 6, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 7, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 7, $cst_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 11, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 11, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 12, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 12, $on_del_flg, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 13, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 13, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 14, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 14, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 15, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 15, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 16, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 16, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 17, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 17, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 18, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 18, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 19, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 19, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 20, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 20, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 21, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 21, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 22, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 22, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 23, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 23, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 24, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 24, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 25, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 25, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 26, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 26, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 27, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 27, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 28, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 28, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 29, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 29, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 30, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 30, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 31, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 31, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 32, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 32, $cst_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0020.StEndDtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate st_dt_fr() {
		return dt_p().st_dt_fr();
	}

	public void st_dt_fr(MCDate value) {
		dt_p().st_dt_fr(value);
	}

	public MCDate st_dt_to() {
		return dt_p().st_dt_to();
	}

	public void st_dt_to(MCDate value) {
		dt_p().st_dt_to(value);
	}

	public MCDate end_dt_fr() {
		return dt_p().end_dt_fr();
	}

	public void end_dt_fr(MCDate value) {
		dt_p().end_dt_fr(value);
	}

	public MCDate end_dt_to() {
		return dt_p().end_dt_to();
	}

	public void end_dt_to(MCDate value) {
		dt_p().end_dt_to(value);
	}

}

