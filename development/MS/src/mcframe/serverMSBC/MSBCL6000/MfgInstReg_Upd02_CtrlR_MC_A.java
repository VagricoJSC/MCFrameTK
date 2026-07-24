package mcframe.serverMSBC.MSBCL6000;

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
 * ブロック"MfgInstReg_Upd02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Upd02_CtrlR_MC_A extends MCConstRow {

	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public static final String $re_alloc_mode_flg = "re_alloc_mode_flg";
	/**
	 * Caller allocation type 呼出元引当種別.<p>
	 *
	 */
	public static final String $is_src_alloc_flg = "is_src_alloc_flg";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";


	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_alloc_mode_flg_META = createCommonMeta($re_alloc_mode_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_alloc_flg_META = createCommonMeta($is_src_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstReg_Upd02_CtrlR> constMetas = new ConstMetaList<MfgInstReg_Upd02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_unit_flg_META,
			re_alloc_mode_flg_META,
			is_src_alloc_flg_META,
			is_src_batch_flg_META,
			upd_cntr_chk_flg_META
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
	protected MfgInstReg_Upd02_CtrlR_MC_A(ConstMetaList<? extends MfgInstReg_Upd02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd02_CtrlR clone() {
		return (MfgInstReg_Upd02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd02_CtrlR createInstance() {
		return (MfgInstReg_Upd02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd02_CtrlR getValues(String... names) {
		return (MfgInstReg_Upd02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 0, $oper_unit_flg);
	}

	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 0, $oper_unit_flg, value);
	}


	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public boolean re_alloc_mode_flg() {
		return getConstBoolean(offset + 1, $re_alloc_mode_flg);
	}

	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public void re_alloc_mode_flg(boolean value) {
		setConstBoolean(offset + 1, $re_alloc_mode_flg, value);
	}


	/**
	 * Caller allocation type 呼出元引当種別.<p>
	 *
	 */
	public boolean is_src_alloc_flg() {
		return getConstBoolean(offset + 2, $is_src_alloc_flg);
	}

	/**
	 * Caller allocation type 呼出元引当種別.<p>
	 *
	 */
	public void is_src_alloc_flg(boolean value) {
		setConstBoolean(offset + 2, $is_src_alloc_flg, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 3, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 3, $is_src_batch_flg, value);
	}


	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 4, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 4, $upd_cntr_chk_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			return is_src_alloc_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			return is_src_alloc_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			is_src_alloc_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			is_src_alloc_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

