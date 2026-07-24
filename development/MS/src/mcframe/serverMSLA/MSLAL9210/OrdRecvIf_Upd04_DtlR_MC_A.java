package mcframe.serverMSLA.MSLAL9210;

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
 * ブロック"OrdRecvIf_Upd04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdRecvIf_Upd04_DtlR_MC_A extends MCConstRow {

	public static final String $ordif = "ordif";
	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public static final String $if_scheduler_typ = "if_scheduler_typ";
	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public static final String $allow_outsrc_schd_flg = "allow_outsrc_schd_flg";

	public static final String $data_lno = $ordif + ".data_lno";
	public static final String $data_no = $ordif + ".data_no";
	public static final String $ext_sys_cd = $ordif + ".ext_sys_cd";
	public static final String $ext_data_no = $ordif + ".ext_data_no";
	public static final String $ext_data_lno = $ordif + ".ext_data_lno";
	public static final String $exe_sts_typ = $ordif + ".exe_sts_typ";
	public static final String $ext_itm_ord_no = $ordif + ".ext_itm_ord_no";
	public static final String $ext_oper_ord_no = $ordif + ".ext_oper_ord_no";

	public static final MCMeta ordif_META = createInnerRowMeta($ordif, mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R.class);
	public static final MCMeta if_scheduler_typ_META = createCommonMeta($if_scheduler_typ, mcframe.commonMS.meta.MS_META.IF_SCHEDULER_TYP);
	public static final MCMeta allow_outsrc_schd_flg_META = createCommonMeta($allow_outsrc_schd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OrdRecvIf_Upd04_DtlR> constMetas = new ConstMetaList<OrdRecvIf_Upd04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ordif_META,
			if_scheduler_typ_META,
			allow_outsrc_schd_flg_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_sys_cd",
				"ext_data_no",
				"ext_data_lno",
				"exe_sts_typ",
				"ext_itm_ord_no",
				"ext_oper_ord_no"
			},
			{
				$data_lno,
				$data_no,
				$ext_sys_cd,
				$ext_data_no,
				$ext_data_lno,
				$exe_sts_typ,
				$ext_itm_ord_no,
				$ext_oper_ord_no
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
	protected OrdRecvIf_Upd04_DtlR_MC_A(ConstMetaList<? extends OrdRecvIf_Upd04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Upd04_DtlR clone() {
		return (OrdRecvIf_Upd04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Upd04_DtlR createInstance() {
		return (OrdRecvIf_Upd04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Upd04_DtlR getValues(String... names) {
		return (OrdRecvIf_Upd04_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R ordif(){
		return (mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R) getConstInnerRow(offset + 0, $ordif);
	}
	
	public void ordif(mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R row){
		setConstInnerRow(offset + 0, $ordif, row);
	}


	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public String if_scheduler_typ() {
		return getConstString(offset + 1, $if_scheduler_typ);
	}

	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public void if_scheduler_typ(String value) {
		setConstString(offset + 1, $if_scheduler_typ, value);
	}


	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public boolean allow_outsrc_schd_flg() {
		return getConstBoolean(offset + 2, $allow_outsrc_schd_flg);
	}

	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public void allow_outsrc_schd_flg(boolean value) {
		setConstBoolean(offset + 2, $allow_outsrc_schd_flg, value);
	}


	public String getString(String name) {
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ordif.equalsIgnoreCase(name)) {
			return ordif();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ordif.equalsIgnoreCase(name)) {
			ordif(
				((MCContainerMeta) ordif_META).castInnerRow(mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return ordif().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		ordif().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return ordif().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		ordif().data_no(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return ordif().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		ordif().ext_sys_cd(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return ordif().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return ordif().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return ordif().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		ordif().exe_sts_typ(value);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return ordif().ext_itm_ord_no();
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		ordif().ext_itm_ord_no(value);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return ordif().ext_oper_ord_no();
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		ordif().ext_oper_ord_no(value);
	}

}

