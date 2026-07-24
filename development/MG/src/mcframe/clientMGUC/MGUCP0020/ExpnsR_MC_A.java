package mcframe.clientMGUC.MGUCP0020;

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
 * ブロック"Expns"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExpnsR_MC_A extends MCConstRow {

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名称.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public static final String $expns_typ = "expns_typ";
	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public static final String $expns_seq = "expns_seq";
	/**
	 * Direct/Indirect type 直間区分.<p>
	 *
	 */
	public static final String $direct_typ = "direct_typ";
	/**
	 * Constant/variable type 固変区分.<p>
	 *
	 */
	public static final String $var_typ = "var_typ";
	/**
	 * Cost element G 費目Ｇ.<p>
	 *
	 */
	public static final String $expns_grp_cd = "expns_grp_cd";
	/**
	 * Cost element G name 費目Ｇ名.<p>
	 *
	 */
	public static final String $expns_grp_nm = "expns_grp_nm";
	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public static final String $expns_grp_seq = "expns_grp_seq";


	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta expns_typ_META = createCommonMeta($expns_typ, mcframe.commonMA.meta.MA_META.EXPNS_TYP);
	public static final MCMeta expns_seq_META = createCommonMeta($expns_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta direct_typ_META = createCommonMeta($direct_typ, mcframe.commonMA.meta.MA_META.DIRECT_TYP);
	public static final MCMeta var_typ_META = createCommonMeta($var_typ, mcframe.commonMA.meta.MA_META.VAR_TYP);
	public static final MCMeta expns_grp_cd_META = createCommonMeta($expns_grp_cd, mcframe.commonMA.meta.MA_META.EXPNS_GRP_CD);
	public static final MCMeta expns_grp_nm_META = createCommonMeta($expns_grp_nm, mcframe.commonMA.meta.MA_META.EXPNS_GRP_NM);
	public static final MCMeta expns_grp_seq_META = createCommonMeta($expns_grp_seq, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<ExpnsR> constMetas = new ConstMetaList<ExpnsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			expns_cd_META,
			expns_nm_META,
			expns_typ_META,
			expns_seq_META,
			direct_typ_META,
			var_typ_META,
			expns_grp_cd_META,
			expns_grp_nm_META,
			expns_grp_seq_META
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
	protected ExpnsR_MC_A(ConstMetaList<? extends ExpnsR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpnsR clone() {
		return (ExpnsR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpnsR createInstance() {
		return (ExpnsR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpnsR getValues(String... names) {
		return (ExpnsR) super.getValues(names);
	}



	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 0, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 0, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名称.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 1, $expns_nm);
	}

	/**
	 * Cost element name 費目名称.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 1, $expns_nm, value);
	}


	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public String expns_typ() {
		return getConstString(offset + 2, $expns_typ);
	}

	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public void expns_typ(String value) {
		setConstString(offset + 2, $expns_typ, value);
	}


	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public MCNumber expns_seq() {
		return getConstNumber(offset + 3, $expns_seq);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(MCNumber value) {
		setConstNumber(offset + 3, $expns_seq, value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(int value) {
		setConstNumber(offset + 3, $expns_seq, value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(long value) {
		setConstNumber(offset + 3, $expns_seq, value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(float value) {
		setConstNumber(offset + 3, $expns_seq, value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(double value) {
		setConstNumber(offset + 3, $expns_seq, value);
	}


	/**
	 * Direct/Indirect type 直間区分.<p>
	 *
	 */
	public String direct_typ() {
		return getConstString(offset + 4, $direct_typ);
	}

	/**
	 * Direct/Indirect type 直間区分.<p>
	 *
	 */
	public void direct_typ(String value) {
		setConstString(offset + 4, $direct_typ, value);
	}


	/**
	 * Constant/variable type 固変区分.<p>
	 *
	 */
	public String var_typ() {
		return getConstString(offset + 5, $var_typ);
	}

	/**
	 * Constant/variable type 固変区分.<p>
	 *
	 */
	public void var_typ(String value) {
		setConstString(offset + 5, $var_typ, value);
	}


	/**
	 * Cost element G 費目Ｇ.<p>
	 *
	 */
	public String expns_grp_cd() {
		return getConstString(offset + 6, $expns_grp_cd);
	}

	/**
	 * Cost element G 費目Ｇ.<p>
	 *
	 */
	public void expns_grp_cd(String value) {
		setConstString(offset + 6, $expns_grp_cd, value);
	}


	/**
	 * Cost element G name 費目Ｇ名.<p>
	 *
	 */
	public String expns_grp_nm() {
		return getConstString(offset + 7, $expns_grp_nm);
	}

	/**
	 * Cost element G name 費目Ｇ名.<p>
	 *
	 */
	public void expns_grp_nm(String value) {
		setConstString(offset + 7, $expns_grp_nm, value);
	}


	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public MCNumber expns_grp_seq() {
		return getConstNumber(offset + 8, $expns_grp_seq);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(MCNumber value) {
		setConstNumber(offset + 8, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(int value) {
		setConstNumber(offset + 8, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(long value) {
		setConstNumber(offset + 8, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(float value) {
		setConstNumber(offset + 8, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(double value) {
		setConstNumber(offset + 8, $expns_grp_seq, value);
	}


	public String getString(String name) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			return direct_typ();
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			return var_typ();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			return expns_seq();
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			return expns_grp_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			return direct_typ();
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			return var_typ();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			return expns_seq();
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			return expns_grp_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			direct_typ(value);
			return;
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			var_typ(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			direct_typ(value);
			return;
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			var_typ(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

