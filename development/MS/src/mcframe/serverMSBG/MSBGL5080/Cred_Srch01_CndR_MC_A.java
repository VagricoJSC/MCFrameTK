package mcframe.serverMSBG.MSBGL5080;

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
 * ブロック"Cred_Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Cred_Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public static final String $cred_amt = "cred_amt";
	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public static final String $cred_limit = "cred_limit";
	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public static final String $cred_bal = "cred_bal";


	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cred_amt_META = createCommonMeta($cred_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_limit_META = createCommonMeta($cred_limit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_bal_META = createCommonMeta($cred_bal, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Cred_Srch01_CndR> constMetas = new ConstMetaList<Cred_Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cst_cd_META,
			acst_cd_META,
			bcst_cd_META,
			cred_cd_META,
			cur_cd_META,
			cred_amt_META,
			cred_limit_META,
			cred_bal_META
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
	protected Cred_Srch01_CndR_MC_A(ConstMetaList<? extends Cred_Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cred_Srch01_CndR clone() {
		return (Cred_Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cred_Srch01_CndR createInstance() {
		return (Cred_Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cred_Srch01_CndR getValues(String... names) {
		return (Cred_Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 0, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 0, $cst_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 1, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 1, $acst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 2, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 2, $bcst_cd, value);
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 3, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 3, $cred_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 4, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 4, $cur_cd, value);
	}


	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public MCNumber cred_amt() {
		return getConstNumber(offset + 5, $cred_amt);
	}

	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public void cred_amt(MCNumber value) {
		setConstNumber(offset + 5, $cred_amt, value);
	}

	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public void cred_amt(int value) {
		setConstNumber(offset + 5, $cred_amt, value);
	}

	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public void cred_amt(long value) {
		setConstNumber(offset + 5, $cred_amt, value);
	}

	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public void cred_amt(float value) {
		setConstNumber(offset + 5, $cred_amt, value);
	}

	/**
	 * Credit usage amount 与信使用額.<p>
	 *
	 */
	public void cred_amt(double value) {
		setConstNumber(offset + 5, $cred_amt, value);
	}


	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public MCNumber cred_limit() {
		return getConstNumber(offset + 6, $cred_limit);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(MCNumber value) {
		setConstNumber(offset + 6, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(int value) {
		setConstNumber(offset + 6, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(long value) {
		setConstNumber(offset + 6, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(float value) {
		setConstNumber(offset + 6, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(double value) {
		setConstNumber(offset + 6, $cred_limit, value);
	}


	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public MCNumber cred_bal() {
		return getConstNumber(offset + 7, $cred_bal);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(MCNumber value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(int value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(long value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(float value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(double value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}


	public String getString(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			return cred_amt();
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			return cred_limit();
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			return cred_bal();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			return cred_amt();
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			return cred_limit();
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			return cred_bal();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

