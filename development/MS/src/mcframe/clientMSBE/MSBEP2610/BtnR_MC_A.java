package mcframe.clientMSBE.MSBEP2610;

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
 * ブロック"Btn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BtnR_MC_A extends MCConstRow {

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
	/**
	 * Keep counted qty. 実棚数量保持.<p>
	 *
	 */
	public static final String $act_qty_keep_flg = "act_qty_keep_flg";
	/**
	 * Inventory count sheet 棚卸表.<p>
	 *
	 */
	public static final String $invlist_flg = "invlist_flg";
	/**
	 * Variance list 差異リスト.<p>
	 *
	 */
	public static final String $difflist_flg = "difflist_flg";


	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta add_io_ctrl_flg_META = createCommonMeta($add_io_ctrl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_qty_keep_flg_META = createCommonMeta($act_qty_keep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta invlist_flg_META = createCommonMeta($invlist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta difflist_flg_META = createCommonMeta($difflist_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BtnR> constMetas = new ConstMetaList<BtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_flg_META,
			add_io_ctrl_flg_META,
			act_qty_keep_flg_META,
			invlist_flg_META,
			difflist_flg_META
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
	protected BtnR_MC_A(ConstMetaList<? extends BtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR clone() {
		return (BtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR createInstance() {
		return (BtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR getValues(String... names) {
		return (BtnR) super.getValues(names);
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


	/**
	 * Keep counted qty. 実棚数量保持.<p>
	 *
	 */
	public boolean act_qty_keep_flg() {
		return getConstBoolean(offset + 2, $act_qty_keep_flg);
	}

	/**
	 * Keep counted qty. 実棚数量保持.<p>
	 *
	 */
	public void act_qty_keep_flg(boolean value) {
		setConstBoolean(offset + 2, $act_qty_keep_flg, value);
	}


	/**
	 * Inventory count sheet 棚卸表.<p>
	 *
	 */
	public boolean invlist_flg() {
		return getConstBoolean(offset + 3, $invlist_flg);
	}

	/**
	 * Inventory count sheet 棚卸表.<p>
	 *
	 */
	public void invlist_flg(boolean value) {
		setConstBoolean(offset + 3, $invlist_flg, value);
	}


	/**
	 * Variance list 差異リスト.<p>
	 *
	 */
	public boolean difflist_flg() {
		return getConstBoolean(offset + 4, $difflist_flg);
	}

	/**
	 * Variance list 差異リスト.<p>
	 *
	 */
	public void difflist_flg(boolean value) {
		setConstBoolean(offset + 4, $difflist_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($add_io_ctrl_flg.equalsIgnoreCase(name)) {
			return add_io_ctrl_flg();
		}
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			return act_qty_keep_flg();
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			return invlist_flg();
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			return difflist_flg();
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
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			return act_qty_keep_flg();
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			return invlist_flg();
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			return difflist_flg();
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
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			act_qty_keep_flg(value);
			return;
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			invlist_flg(value);
			return;
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			difflist_flg(value);
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
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			act_qty_keep_flg(value);
			return;
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			invlist_flg(value);
			return;
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			difflist_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

