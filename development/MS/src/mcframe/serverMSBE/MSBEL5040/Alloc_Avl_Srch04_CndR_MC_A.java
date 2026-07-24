package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Alloc_Avl_Srch04_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Alloc_Avl_Srch04_CndR_MC_A extends MCConstRow {

	/**
	 * True if only the first matched record is returned 適合した最初のレコードだけを返す場合true.<p>
	 *
	 */
	public static final String $one_flg = "one_flg";
	/**
	 * True if allocation will be processed without sorting ソートしないで引当処理をする場合true.<p>
	 *
	 */
	public static final String $gr_no_sort_flg = "gr_no_sort_flg";
	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_zero_flg = "except_zero_flg";
	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public static final String $short_ope_typ = "short_ope_typ";
	/**
	 * Process type 処理タイプ.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";


	public static final MCMeta one_flg_META = createCommonMeta($one_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_no_sort_flg_META = createCommonMeta($gr_no_sort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_zero_flg_META = createCommonMeta($except_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta short_ope_typ_META = createCommonMeta($short_ope_typ, mcframe.commonMS.meta.MS_META.SHORT_OPE_TYP);
	public static final MCMeta proc_typ_META = createStringMeta($proc_typ);

	protected static final ConstMetaList<Alloc_Avl_Srch04_CndR> constMetas = new ConstMetaList<Alloc_Avl_Srch04_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			one_flg_META,
			gr_no_sort_flg_META,
			except_zero_flg_META,
			short_ope_typ_META,
			proc_typ_META
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
	protected Alloc_Avl_Srch04_CndR_MC_A(ConstMetaList<? extends Alloc_Avl_Srch04_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch04_CndR clone() {
		return (Alloc_Avl_Srch04_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch04_CndR createInstance() {
		return (Alloc_Avl_Srch04_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch04_CndR getValues(String... names) {
		return (Alloc_Avl_Srch04_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * True if only the first matched record is returned 適合した最初のレコードだけを返す場合true.<p>
	 *
	 */
	public boolean one_flg() {
		return getConstBoolean(offset + 0, $one_flg);
	}

	/**
	 * True if only the first matched record is returned 適合した最初のレコードだけを返す場合true.<p>
	 *
	 */
	public void one_flg(boolean value) {
		setConstBoolean(offset + 0, $one_flg, value);
	}


	/**
	 * True if allocation will be processed without sorting ソートしないで引当処理をする場合true.<p>
	 *
	 */
	public boolean gr_no_sort_flg() {
		return getConstBoolean(offset + 1, $gr_no_sort_flg);
	}

	/**
	 * True if allocation will be processed without sorting ソートしないで引当処理をする場合true.<p>
	 *
	 */
	public void gr_no_sort_flg(boolean value) {
		setConstBoolean(offset + 1, $gr_no_sort_flg, value);
	}


	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_zero_flg() {
		return getConstBoolean(offset + 2, $except_zero_flg);
	}

	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public void except_zero_flg(boolean value) {
		setConstBoolean(offset + 2, $except_zero_flg, value);
	}


	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public String short_ope_typ() {
		return getConstString(offset + 3, $short_ope_typ);
	}

	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public void short_ope_typ(String value) {
		setConstString(offset + 3, $short_ope_typ, value);
	}


	/**
	 * Process type 処理タイプ.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 4, $proc_typ);
	}

	/**
	 * Process type 処理タイプ.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 4, $proc_typ, value);
	}


	public String getString(String name) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			return short_ope_typ();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($one_flg.equalsIgnoreCase(name)) {
			return one_flg();
		}
		if ($gr_no_sort_flg.equalsIgnoreCase(name)) {
			return gr_no_sort_flg();
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			return except_zero_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			return short_ope_typ();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($one_flg.equalsIgnoreCase(name)) {
			return one_flg();
		}
		if ($gr_no_sort_flg.equalsIgnoreCase(name)) {
			return gr_no_sort_flg();
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			return except_zero_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			short_ope_typ(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($one_flg.equalsIgnoreCase(name)) {
			one_flg(value);
			return;
		}
		if ($gr_no_sort_flg.equalsIgnoreCase(name)) {
			gr_no_sort_flg(value);
			return;
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			except_zero_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			short_ope_typ(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($one_flg.equalsIgnoreCase(name)) {
			one_flg(value);
			return;
		}
		if ($gr_no_sort_flg.equalsIgnoreCase(name)) {
			gr_no_sort_flg(value);
			return;
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			except_zero_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

