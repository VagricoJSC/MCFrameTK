package mcframe.clientMSBB.MSBBP0110;

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
 * ブロック"UsrDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class UsrDtlR_MC_A extends MCConstRow {

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Input PIC cd. 入力担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Input PIC name 入力担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Internal remarks by input value 入力別内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public static final String $spln_ym = "spln_ym";
	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public static final String $usr_spln_qty = "usr_spln_qty";
	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public static final String $usr_spln_amt = "usr_spln_amt";


	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_USR_INTR_RMRKS);
	public static final MCMeta spln_ym_META = createCommonMeta($spln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_spln_qty_META = createCommonMeta($usr_spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta usr_spln_amt_META = createCommonMeta($usr_spln_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<UsrDtlR> constMetas = new ConstMetaList<UsrDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_peg_no_META,
			usr_cd_META,
			usr_nm_META,
			intr_rmrks_META,
			spln_ym_META,
			usr_spln_qty_META,
			usr_spln_amt_META
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$grp_peg_no, "HKEY"},	// grp_peg_no
				{$usr_cd, "HKEY"},	// usr_cd
				{$usr_nm, "HKEY"},	// usr_nm
				{$intr_rmrks, "HKEY"},	// intr_rmrks
				{$spln_ym, "ELM"},	// spln_ym
				{$usr_spln_qty, "HVAL"},	// usr_spln_qty
				{$usr_spln_amt, "HVAL"}	// usr_spln_amt
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
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
	protected UsrDtlR_MC_A(ConstMetaList<? extends UsrDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UsrDtlR clone() {
		return (UsrDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UsrDtlR createInstance() {
		return (UsrDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UsrDtlR getValues(String... names) {
		return (UsrDtlR) super.getValues(names);
	}



	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 0, $grp_peg_no);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}


	/**
	 * Input PIC cd. 入力担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 1, $usr_cd);
	}

	/**
	 * Input PIC cd. 入力担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 1, $usr_cd, value);
	}


	/**
	 * Input PIC name 入力担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 2, $usr_nm);
	}

	/**
	 * Input PIC name 入力担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 2, $usr_nm, value);
	}


	/**
	 * Internal remarks by input value 入力別内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 3, $intr_rmrks);
	}

	/**
	 * Internal remarks by input value 入力別内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 3, $intr_rmrks, value);
	}


	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public MCDate spln_ym() {
		return getConstDate(offset + 4, $spln_ym);
	}

	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public void spln_ym(MCDate value) {
		setConstDate(offset + 4, $spln_ym, value);
	}


	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public MCNumber usr_spln_qty() {
		return getConstNumber(offset + 5, $usr_spln_qty);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void usr_spln_qty(MCNumber value) {
		setConstNumber(offset + 5, $usr_spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void usr_spln_qty(int value) {
		setConstNumber(offset + 5, $usr_spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void usr_spln_qty(long value) {
		setConstNumber(offset + 5, $usr_spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void usr_spln_qty(float value) {
		setConstNumber(offset + 5, $usr_spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void usr_spln_qty(double value) {
		setConstNumber(offset + 5, $usr_spln_qty, value);
	}


	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public MCNumber usr_spln_amt() {
		return getConstNumber(offset + 6, $usr_spln_amt);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void usr_spln_amt(MCNumber value) {
		setConstNumber(offset + 6, $usr_spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void usr_spln_amt(int value) {
		setConstNumber(offset + 6, $usr_spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void usr_spln_amt(long value) {
		setConstNumber(offset + 6, $usr_spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void usr_spln_amt(float value) {
		setConstNumber(offset + 6, $usr_spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void usr_spln_amt(double value) {
		setConstNumber(offset + 6, $usr_spln_amt, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			return usr_spln_qty();
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			return usr_spln_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			return usr_spln_qty();
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			return usr_spln_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($usr_spln_qty.equalsIgnoreCase(name)) {
			usr_spln_qty(value);
			return;
		}
		if ($usr_spln_amt.equalsIgnoreCase(name)) {
			usr_spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

