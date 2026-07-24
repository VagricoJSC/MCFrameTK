package mcframe.serverMGUC.MGUCL0020;

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
 * ブロック"Expns"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExpnsR_MC_A extends MCConstRow {

	/**
	 * Cost element item 費目.<p>
	 *
	 */
	public static final String $exp = "exp";
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

	public static final String $expns_cd = $exp + ".expns_cd";
	public static final String $expns_nm = $exp + ".expns_nm";
	public static final String $expns_typ = $exp + ".expns_typ";
	public static final String $expns_seq = $exp + ".expns_seq";
	public static final String $direct_typ = $exp + ".direct_typ";
	public static final String $var_typ = $exp + ".var_typ";
	public static final String $expns_grp_cd = $exp + ".expns_grp_cd";

	public static final MCMeta exp_META = createInnerRowMeta($exp, mcframe.serverMA.dbc.MAM_EXPNS_R.class);
	public static final MCMeta expns_grp_nm_META = createCommonMeta($expns_grp_nm, mcframe.commonMA.meta.MA_META.EXPNS_GRP_NM);
	public static final MCMeta expns_grp_seq_META = createCommonMeta($expns_grp_seq, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<ExpnsR> constMetas = new ConstMetaList<ExpnsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			exp_META,
			expns_grp_nm_META,
			expns_grp_seq_META
		},
		new String[][]{
			{
				"expns_cd",
				"expns_nm",
				"expns_typ",
				"expns_seq",
				"direct_typ",
				"var_typ",
				"expns_grp_cd"
			},
			{
				$expns_cd,
				$expns_nm,
				$expns_typ,
				$expns_seq,
				$direct_typ,
				$var_typ,
				$expns_grp_cd
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Cost element item 費目.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_EXPNS_R exp(){
		return (mcframe.serverMA.dbc.MAM_EXPNS_R) getConstInnerRow(offset + 0, $exp);
	}
	
	/**
	 * Cost element item 費目.<p>
	 *
	 */
	public void exp(mcframe.serverMA.dbc.MAM_EXPNS_R row){
		setConstInnerRow(offset + 0, $exp, row);
	}


	/**
	 * Cost element G name 費目Ｇ名.<p>
	 *
	 */
	public String expns_grp_nm() {
		return getConstString(offset + 1, $expns_grp_nm);
	}

	/**
	 * Cost element G name 費目Ｇ名.<p>
	 *
	 */
	public void expns_grp_nm(String value) {
		setConstString(offset + 1, $expns_grp_nm, value);
	}


	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public MCNumber expns_grp_seq() {
		return getConstNumber(offset + 2, $expns_grp_seq);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(MCNumber value) {
		setConstNumber(offset + 2, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(int value) {
		setConstNumber(offset + 2, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(long value) {
		setConstNumber(offset + 2, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(float value) {
		setConstNumber(offset + 2, $expns_grp_seq, value);
	}

	/**
	 * Display order (cost element G) 表示順（費目Ｇ）.<p>
	 *
	 */
	public void expns_grp_seq(double value) {
		setConstNumber(offset + 2, $expns_grp_seq, value);
	}


	public String getString(String name) {
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			return expns_grp_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			return expns_grp_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($expns_grp_seq.equalsIgnoreCase(name)) {
			expns_grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($exp.equalsIgnoreCase(name)) {
			return exp();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($exp.equalsIgnoreCase(name)) {
			exp(
				((MCContainerMeta) exp_META).castInnerRow(mcframe.serverMA.dbc.MAM_EXPNS_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return exp().expns_cd();
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		exp().expns_cd(value);
	}

	/**
	 * Cost element name 費目名称.<p>
	 *
	 */
	public String expns_nm() {
		return exp().expns_nm();
	}

	/**
	 * Cost element name 費目名称.<p>
	 *
	 */
	public void expns_nm(String value) {
		exp().expns_nm(value);
	}

	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public String expns_typ() {
		return exp().expns_typ();
	}

	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public void expns_typ(String value) {
		exp().expns_typ(value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public MCNumber expns_seq() {
		return exp().expns_seq();
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(MCNumber value) {
		exp().expns_seq(value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(int value) {
		exp().expns_seq(value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(long value) {
		exp().expns_seq(value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(float value) {
		exp().expns_seq(value);
	}

	/**
	 * Display order (cost element) 表示順（費目）.<p>
	 *
	 */
	public void expns_seq(double value) {
		exp().expns_seq(value);
	}

	/**
	 * Direct/Indirect type 直間区分.<p>
	 *
	 */
	public String direct_typ() {
		return exp().direct_typ();
	}

	/**
	 * Direct/Indirect type 直間区分.<p>
	 *
	 */
	public void direct_typ(String value) {
		exp().direct_typ(value);
	}

	/**
	 * Constant/variable type 固変区分.<p>
	 *
	 */
	public String var_typ() {
		return exp().var_typ();
	}

	/**
	 * Constant/variable type 固変区分.<p>
	 *
	 */
	public void var_typ(String value) {
		exp().var_typ(value);
	}

	/**
	 * Cost element G 費目Ｇ.<p>
	 *
	 */
	public String expns_grp_cd() {
		return exp().expns_grp_cd();
	}

	/**
	 * Cost element G 費目Ｇ.<p>
	 *
	 */
	public void expns_grp_cd(String value) {
		exp().expns_grp_cd(value);
	}

}

