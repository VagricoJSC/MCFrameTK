package mcframe.serverMSBE.MSBEL5200;

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
 * ブロック"XfrSchdChk02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrSchdChk02_CtrlR_MC_A extends MCConstRow {

	/**
	 * Schedule flg. 予定ＦＬＧ.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Order flg. 指図ＦＬＧ.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Result flg. 実績ＦＬＧ.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Recursive call flg. 再帰呼出ＦＬＧ.<p>
	 *
	 */
	public static final String $re_call_flg = "re_call_flg";
	public static final String $alloc_off_flg = "alloc_off_flg";


	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_call_flg_META = createCommonMeta($re_call_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_off_flg_META = createCommonMeta($alloc_off_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrSchdChk02_CtrlR> constMetas = new ConstMetaList<XfrSchdChk02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			schd_flg_META,
			inst_flg_META,
			act_flg_META,
			re_call_flg_META,
			alloc_off_flg_META
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
	protected XfrSchdChk02_CtrlR_MC_A(ConstMetaList<? extends XfrSchdChk02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk02_CtrlR clone() {
		return (XfrSchdChk02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk02_CtrlR createInstance() {
		return (XfrSchdChk02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk02_CtrlR getValues(String... names) {
		return (XfrSchdChk02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Schedule flg. 予定ＦＬＧ.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 0, $schd_flg);
	}

	/**
	 * Schedule flg. 予定ＦＬＧ.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 0, $schd_flg, value);
	}


	/**
	 * Order flg. 指図ＦＬＧ.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 1, $inst_flg);
	}

	/**
	 * Order flg. 指図ＦＬＧ.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 1, $inst_flg, value);
	}


	/**
	 * Result flg. 実績ＦＬＧ.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 2, $act_flg);
	}

	/**
	 * Result flg. 実績ＦＬＧ.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 2, $act_flg, value);
	}


	/**
	 * Recursive call flg. 再帰呼出ＦＬＧ.<p>
	 *
	 */
	public boolean re_call_flg() {
		return getConstBoolean(offset + 3, $re_call_flg);
	}

	/**
	 * Recursive call flg. 再帰呼出ＦＬＧ.<p>
	 *
	 */
	public void re_call_flg(boolean value) {
		setConstBoolean(offset + 3, $re_call_flg, value);
	}


	public boolean alloc_off_flg() {
		return getConstBoolean(offset + 4, $alloc_off_flg);
	}

	public void alloc_off_flg(boolean value) {
		setConstBoolean(offset + 4, $alloc_off_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($re_call_flg.equalsIgnoreCase(name)) {
			return re_call_flg();
		}
		if ($alloc_off_flg.equalsIgnoreCase(name)) {
			return alloc_off_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($re_call_flg.equalsIgnoreCase(name)) {
			return re_call_flg();
		}
		if ($alloc_off_flg.equalsIgnoreCase(name)) {
			return alloc_off_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($re_call_flg.equalsIgnoreCase(name)) {
			re_call_flg(value);
			return;
		}
		if ($alloc_off_flg.equalsIgnoreCase(name)) {
			alloc_off_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($re_call_flg.equalsIgnoreCase(name)) {
			re_call_flg(value);
			return;
		}
		if ($alloc_off_flg.equalsIgnoreCase(name)) {
			alloc_off_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

