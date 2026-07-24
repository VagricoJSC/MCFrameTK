package mcframe.serverMSBE.MSBEL2610;

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
 * ブロック"Upd02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd02_CtrlR_MC_A extends MCConstRow {

	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * GR/GI control 入出庫制御.<p>
	 *
	 */
	public static final String $add_io_ctrl_flg = "add_io_ctrl_flg";


	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta add_io_ctrl_flg_META = createCommonMeta($add_io_ctrl_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Upd02_CtrlR> constMetas = new ConstMetaList<Upd02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_flg_META,
			add_io_ctrl_flg_META
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
	protected Upd02_CtrlR_MC_A(ConstMetaList<? extends Upd02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_CtrlR clone() {
		return (Upd02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_CtrlR createInstance() {
		return (Upd02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_CtrlR getValues(String... names) {
		return (Upd02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 0, $prnt_flg);
	}

	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 0, $prnt_flg, value);
	}


	/**
	 * GR/GI control 入出庫制御.<p>
	 *
	 */
	public boolean add_io_ctrl_flg() {
		return getConstBoolean(offset + 1, $add_io_ctrl_flg);
	}

	/**
	 * GR/GI control 入出庫制御.<p>
	 *
	 */
	public void add_io_ctrl_flg(boolean value) {
		setConstBoolean(offset + 1, $add_io_ctrl_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($add_io_ctrl_flg.equalsIgnoreCase(name)) {
			return add_io_ctrl_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($add_io_ctrl_flg.equalsIgnoreCase(name)) {
			return add_io_ctrl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($add_io_ctrl_flg.equalsIgnoreCase(name)) {
			add_io_ctrl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($add_io_ctrl_flg.equalsIgnoreCase(name)) {
			add_io_ctrl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

