package mcframe.serverMAUC.MAUCL5010;

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
 * ブロック"PushNtc_Upd01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PushNtc_Upd01_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public static final String $push_ntc_typ = "push_ntc_typ";
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public static final String $msg_id = "msg_id";
	/**
	 * Notify-from module ID 通知元モジュールＩＤ.<p>
	 *
	 */
	public static final String $src_module_id = "src_module_id";
	/**
	 * Notify-from logic ID 通知元ロジックＩＤ.<p>
	 *
	 */
	public static final String $src_logic_id = "src_logic_id";
	/**
	 * Notify-from operation ID 通知元オペレーションＩＤ.<p>
	 *
	 */
	public static final String $src_operation_id = "src_operation_id";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta push_ntc_typ_META = createCommonMeta($push_ntc_typ, mcframe.commonMA.meta.MA_META.PUSH_NTC_TYP);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta src_module_id_META = createCommonMeta($src_module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta src_logic_id_META = createCommonMeta($src_logic_id, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta src_operation_id_META = createCommonMeta($src_operation_id, mcframe.commonMA.meta.MA_META.OPERATION);

	protected static final ConstMetaList<PushNtc_Upd01_Dtl1R> constMetas = new ConstMetaList<PushNtc_Upd01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			push_ntc_typ_META,
			msg_id_META,
			src_module_id_META,
			src_logic_id_META,
			src_operation_id_META
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
	protected PushNtc_Upd01_Dtl1R_MC_A(ConstMetaList<? extends PushNtc_Upd01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Dtl1R clone() {
		return (PushNtc_Upd01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Dtl1R createInstance() {
		return (PushNtc_Upd01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Dtl1R getValues(String... names) {
		return (PushNtc_Upd01_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public String push_ntc_typ() {
		return getConstString(offset + 1, $push_ntc_typ);
	}

	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public void push_ntc_typ(String value) {
		setConstString(offset + 1, $push_ntc_typ, value);
	}


	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return getConstString(offset + 2, $msg_id);
	}

	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		setConstString(offset + 2, $msg_id, value);
	}


	/**
	 * Notify-from module ID 通知元モジュールＩＤ.<p>
	 *
	 */
	public String src_module_id() {
		return getConstString(offset + 3, $src_module_id);
	}

	/**
	 * Notify-from module ID 通知元モジュールＩＤ.<p>
	 *
	 */
	public void src_module_id(String value) {
		setConstString(offset + 3, $src_module_id, value);
	}


	/**
	 * Notify-from logic ID 通知元ロジックＩＤ.<p>
	 *
	 */
	public String src_logic_id() {
		return getConstString(offset + 4, $src_logic_id);
	}

	/**
	 * Notify-from logic ID 通知元ロジックＩＤ.<p>
	 *
	 */
	public void src_logic_id(String value) {
		setConstString(offset + 4, $src_logic_id, value);
	}


	/**
	 * Notify-from operation ID 通知元オペレーションＩＤ.<p>
	 *
	 */
	public String src_operation_id() {
		return getConstString(offset + 5, $src_operation_id);
	}

	/**
	 * Notify-from operation ID 通知元オペレーションＩＤ.<p>
	 *
	 */
	public void src_operation_id(String value) {
		setConstString(offset + 5, $src_operation_id, value);
	}


	public String getString(String name) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($src_module_id.equalsIgnoreCase(name)) {
			return src_module_id();
		}
		if ($src_logic_id.equalsIgnoreCase(name)) {
			return src_logic_id();
		}
		if ($src_operation_id.equalsIgnoreCase(name)) {
			return src_operation_id();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($src_module_id.equalsIgnoreCase(name)) {
			return src_module_id();
		}
		if ($src_logic_id.equalsIgnoreCase(name)) {
			return src_logic_id();
		}
		if ($src_operation_id.equalsIgnoreCase(name)) {
			return src_operation_id();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			push_ntc_typ(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($src_module_id.equalsIgnoreCase(name)) {
			src_module_id(value);
			return;
		}
		if ($src_logic_id.equalsIgnoreCase(name)) {
			src_logic_id(value);
			return;
		}
		if ($src_operation_id.equalsIgnoreCase(name)) {
			src_operation_id(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			push_ntc_typ(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($src_module_id.equalsIgnoreCase(name)) {
			src_module_id(value);
			return;
		}
		if ($src_logic_id.equalsIgnoreCase(name)) {
			src_logic_id(value);
			return;
		}
		if ($src_operation_id.equalsIgnoreCase(name)) {
			src_operation_id(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

