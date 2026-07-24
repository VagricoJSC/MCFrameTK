package mcframe.serverMSBG.MSBGB0060;

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
 * ブロック"NoteSttl_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class NoteSttl_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Date 対象日.<p>
	 *
	 */
	public static final String $tgt_dt = "tgt_dt";


	public static final MCMeta tgt_dt_META = createCommonMeta($tgt_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<NoteSttl_Upd01_CndR> constMetas = new ConstMetaList<NoteSttl_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tgt_dt_META
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
	protected NoteSttl_Upd01_CndR_MC_A(ConstMetaList<? extends NoteSttl_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public NoteSttl_Upd01_CndR clone() {
		return (NoteSttl_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public NoteSttl_Upd01_CndR createInstance() {
		return (NoteSttl_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public NoteSttl_Upd01_CndR getValues(String... names) {
		return (NoteSttl_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDate tgt_dt() {
		return getConstDate(offset + 0, $tgt_dt);
	}

	/**
	 * Date 対象日.<p>
	 *
	 */
	public void tgt_dt(MCDate value) {
		setConstDate(offset + 0, $tgt_dt, value);
	}


	public MCDate getDate(String name) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

