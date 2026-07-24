package mcframe.serverMSLA.MSLAL5140;

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
 * ブロック"DlvInstRecvIf_Upd04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvInstRecvIf_Upd04_DtlR_MC_A extends MCConstRow {

	public static final String $dlvInst = "dlvInst";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";

	public static final String $data_lno = $dlvInst + ".data_lno";
	public static final String $data_no = $dlvInst + ".data_no";
	public static final String $ext_data_no = $dlvInst + ".ext_data_no";
	public static final String $ext_data_lno = $dlvInst + ".ext_data_lno";
	public static final String $exe_sts_typ = $dlvInst + ".exe_sts_typ";
	public static final String $cst_po_no = $dlvInst + ".cst_po_no";
	public static final String $cst_po_rev = $dlvInst + ".cst_po_rev";
	public static final String $cst_po_d_no = $dlvInst + ".cst_po_d_no";
	public static final String $cst_cd = $dlvInst + ".cst_cd";
	public static final String $log_sub_key1 = $dlvInst + ".log_sub_key1";
	public static final String $log_sub_key2 = $dlvInst + ".log_sub_key2";

	public static final MCMeta dlvInst_META = createInnerRowMeta($dlvInst, mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);

	protected static final ConstMetaList<DlvInstRecvIf_Upd04_DtlR> constMetas = new ConstMetaList<DlvInstRecvIf_Upd04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlvInst_META,
			wg_cd_META,
			sls_usr_cd_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_data_no",
				"ext_data_lno",
				"exe_sts_typ",
				"cst_po_no",
				"cst_po_rev",
				"cst_po_d_no",
				"cst_cd",
				"log_sub_key1",
				"log_sub_key2"
			},
			{
				$data_lno,
				$data_no,
				$ext_data_no,
				$ext_data_lno,
				$exe_sts_typ,
				$cst_po_no,
				$cst_po_rev,
				$cst_po_d_no,
				$cst_cd,
				$log_sub_key1,
				$log_sub_key2
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
	protected DlvInstRecvIf_Upd04_DtlR_MC_A(ConstMetaList<? extends DlvInstRecvIf_Upd04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRecvIf_Upd04_DtlR clone() {
		return (DlvInstRecvIf_Upd04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRecvIf_Upd04_DtlR createInstance() {
		return (DlvInstRecvIf_Upd04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRecvIf_Upd04_DtlR getValues(String... names) {
		return (DlvInstRecvIf_Upd04_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R dlvInst(){
		return (mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R) getConstInnerRow(offset + 0, $dlvInst);
	}
	
	public void dlvInst(mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R row){
		setConstInnerRow(offset + 0, $dlvInst, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 2, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 2, $sls_usr_cd, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlvInst.equalsIgnoreCase(name)) {
			return dlvInst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlvInst.equalsIgnoreCase(name)) {
			dlvInst(
				((MCContainerMeta) dlvInst_META).castInnerRow(mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R.class, value)
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
		return dlvInst().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return dlvInst().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		dlvInst().data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return dlvInst().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return dlvInst().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return dlvInst().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		dlvInst().exe_sts_typ(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return dlvInst().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		dlvInst().cst_po_no(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return dlvInst().cst_po_rev();
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return dlvInst().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		dlvInst().cst_po_d_no(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return dlvInst().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		dlvInst().cst_cd(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return dlvInst().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return dlvInst().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		dlvInst().log_sub_key2(value);
	}

}

