package mcframe.clientMAUB.MAUBP5210;

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
 * ブロック"Hrrchy"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HrrchyR_MC_A extends MCConstRow {

	public static final String $hrrchy = "hrrchy";
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public static final String $hrrchy_str = "hrrchy_str";
	/**
	 * Explosion 展開.<p>
	 *
	 */
	public static final String $ext = "ext";
	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public static final String $extno = "extno";
	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public static final String $par_extno = "par_extno";
	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public static final String $sort_col = "sort_col";
	/**
	 * Bottom 最下層.<p>
	 *
	 */
	public static final String $bottom_flg = "bottom_flg";
	/**
	 * Loop ループ.<p>
	 *
	 */
	public static final String $loop_flg = "loop_flg";
	public static final String $leaf = "leaf";
	public static final String $leaf_str = "leaf_str";


	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta hrrchy_str_META = createCommonMeta($hrrchy_str, mcframe.commonMA.meta.MA_META.TREE_LVL_STR);
	public static final MCMeta ext_META = createCommonMeta($ext, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta extno_META = createNumberMeta($extno);
	public static final MCMeta par_extno_META = createNumberMeta($par_extno);
	public static final MCMeta sort_col_META = createNumberMeta($sort_col);
	public static final MCMeta bottom_flg_META = createCommonMeta($bottom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loop_flg_META = createCommonMeta($loop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta leaf_META = createCommonMeta($leaf, mcframe.commonMA.meta.MA_META.LEAF_STR);
	public static final MCMeta leaf_str_META = createCommonMeta($leaf_str, mcframe.commonMA.meta.MA_META.LEAF_STR);

	protected static final ConstMetaList<HrrchyR> constMetas = new ConstMetaList<HrrchyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_META,
			hrrchy_str_META,
			ext_META,
			extno_META,
			par_extno_META,
			sort_col_META,
			bottom_flg_META,
			loop_flg_META,
			leaf_META,
			leaf_str_META
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
	protected HrrchyR_MC_A(ConstMetaList<? extends HrrchyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HrrchyR clone() {
		return (HrrchyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HrrchyR createInstance() {
		return (HrrchyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HrrchyR getValues(String... names) {
		return (HrrchyR) super.getValues(names);
	}



	public MCNumber hrrchy() {
		return getConstNumber(offset + 0, $hrrchy);
	}

	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	public void hrrchy(int value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	public void hrrchy(long value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	public void hrrchy(float value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	public void hrrchy(double value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public String hrrchy_str() {
		return getConstString(offset + 1, $hrrchy_str);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy_str(String value) {
		setConstString(offset + 1, $hrrchy_str, value);
	}


	/**
	 * Explosion 展開.<p>
	 *
	 */
	public boolean ext() {
		return getConstBoolean(offset + 2, $ext);
	}

	/**
	 * Explosion 展開.<p>
	 *
	 */
	public void ext(boolean value) {
		setConstBoolean(offset + 2, $ext, value);
	}


	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public MCNumber extno() {
		return getConstNumber(offset + 3, $extno);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(MCNumber value) {
		setConstNumber(offset + 3, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(int value) {
		setConstNumber(offset + 3, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(long value) {
		setConstNumber(offset + 3, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(float value) {
		setConstNumber(offset + 3, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(double value) {
		setConstNumber(offset + 3, $extno, value);
	}


	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public MCNumber par_extno() {
		return getConstNumber(offset + 4, $par_extno);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(MCNumber value) {
		setConstNumber(offset + 4, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(int value) {
		setConstNumber(offset + 4, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(long value) {
		setConstNumber(offset + 4, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(float value) {
		setConstNumber(offset + 4, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(double value) {
		setConstNumber(offset + 4, $par_extno, value);
	}


	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public MCNumber sort_col() {
		return getConstNumber(offset + 5, $sort_col);
	}

	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public void sort_col(MCNumber value) {
		setConstNumber(offset + 5, $sort_col, value);
	}

	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public void sort_col(int value) {
		setConstNumber(offset + 5, $sort_col, value);
	}

	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public void sort_col(long value) {
		setConstNumber(offset + 5, $sort_col, value);
	}

	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public void sort_col(float value) {
		setConstNumber(offset + 5, $sort_col, value);
	}

	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public void sort_col(double value) {
		setConstNumber(offset + 5, $sort_col, value);
	}


	/**
	 * Bottom 最下層.<p>
	 *
	 */
	public boolean bottom_flg() {
		return getConstBoolean(offset + 6, $bottom_flg);
	}

	/**
	 * Bottom 最下層.<p>
	 *
	 */
	public void bottom_flg(boolean value) {
		setConstBoolean(offset + 6, $bottom_flg, value);
	}


	/**
	 * Loop ループ.<p>
	 *
	 */
	public boolean loop_flg() {
		return getConstBoolean(offset + 7, $loop_flg);
	}

	/**
	 * Loop ループ.<p>
	 *
	 */
	public void loop_flg(boolean value) {
		setConstBoolean(offset + 7, $loop_flg, value);
	}


	public String leaf() {
		return getConstString(offset + 8, $leaf);
	}

	public void leaf(String value) {
		setConstString(offset + 8, $leaf, value);
	}


	public String leaf_str() {
		return getConstString(offset + 9, $leaf_str);
	}

	public void leaf_str(String value) {
		setConstString(offset + 9, $leaf_str, value);
	}


	public String getString(String name) {
		if ($hrrchy_str.equalsIgnoreCase(name)) {
			return hrrchy_str();
		}
		if ($leaf.equalsIgnoreCase(name)) {
			return leaf();
		}
		if ($leaf_str.equalsIgnoreCase(name)) {
			return leaf_str();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			return sort_col();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($ext.equalsIgnoreCase(name)) {
			return ext();
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($hrrchy_str.equalsIgnoreCase(name)) {
			return hrrchy_str();
		}
		if ($leaf.equalsIgnoreCase(name)) {
			return leaf();
		}
		if ($leaf_str.equalsIgnoreCase(name)) {
			return leaf_str();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			return sort_col();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ext.equalsIgnoreCase(name)) {
			return ext();
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($hrrchy_str.equalsIgnoreCase(name)) {
			hrrchy_str(value);
			return;
		}
		if ($leaf.equalsIgnoreCase(name)) {
			leaf(value);
			return;
		}
		if ($leaf_str.equalsIgnoreCase(name)) {
			leaf_str(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ext.equalsIgnoreCase(name)) {
			ext(value);
			return;
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($hrrchy_str.equalsIgnoreCase(name)) {
			hrrchy_str(value);
			return;
		}
		if ($leaf.equalsIgnoreCase(name)) {
			leaf(value);
			return;
		}
		if ($leaf_str.equalsIgnoreCase(name)) {
			leaf_str(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($sort_col.equalsIgnoreCase(name)) {
			sort_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ext.equalsIgnoreCase(name)) {
			ext(value);
			return;
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

