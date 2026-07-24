package mcframe.serverMSBB.MSBBL0110;

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
 * ブロック"Srch02_UsrDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_UsrDtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public static final String $spln_ym = "spln_ym";
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
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public static final String $spln_amt = "spln_amt";
	/**
	 * Internal remarks by input value 入力別内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";


	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta spln_ym_META = createCommonMeta($spln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_amt_META = createCommonMeta($spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_USR_INTR_RMRKS);

	protected static final ConstMetaList<Srch02_UsrDtlR> constMetas = new ConstMetaList<Srch02_UsrDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_peg_no_META,
			spln_ym_META,
			usr_cd_META,
			usr_nm_META,
			spln_qty_META,
			spln_amt_META,
			intr_rmrks_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch02_UsrDtlR_MC_A(ConstMetaList<? extends Srch02_UsrDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_UsrDtlR clone() {
		return (Srch02_UsrDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_UsrDtlR createInstance() {
		return (Srch02_UsrDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_UsrDtlR getValues(String... names) {
		return (Srch02_UsrDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 0, $grp_peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}


	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public MCDate spln_ym() {
		return getConstDate(offset + 1, $spln_ym);
	}

	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public void spln_ym(MCDate value) {
		setConstDate(offset + 1, $spln_ym, value);
	}


	/**
	 * Input PIC cd. 入力担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 2, $usr_cd);
	}

	/**
	 * Input PIC cd. 入力担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 2, $usr_cd, value);
	}


	/**
	 * Input PIC name 入力担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 3, $usr_nm);
	}

	/**
	 * Input PIC name 入力担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 3, $usr_nm, value);
	}


	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 4, $spln_qty);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 4, $spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 4, $spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 4, $spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 4, $spln_qty, value);
	}

	/**
	 * Breakdown qty. for each input 入力別内訳数量.<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 4, $spln_qty, value);
	}


	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 5, $spln_amt);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 5, $spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 5, $spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 5, $spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 5, $spln_amt, value);
	}

	/**
	 * Breakdown amount for each input 入力別内訳金額.<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 5, $spln_amt, value);
	}


	/**
	 * Internal remarks by input value 入力別内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 6, $intr_rmrks);
	}

	/**
	 * Internal remarks by input value 入力別内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 6, $intr_rmrks, value);
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
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
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
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
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
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
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
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
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

