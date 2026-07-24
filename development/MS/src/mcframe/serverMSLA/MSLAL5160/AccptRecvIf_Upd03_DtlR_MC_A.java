package mcframe.serverMSLA.MSLAL5160;

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
 * ブロック"AccptRecvIf_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AccptRecvIf_Upd03_DtlR_MC_A extends MCConstRow {

	public static final String $accpt = "accpt";

	public static final String $data_lno = $accpt + ".data_lno";
	public static final String $data_no = $accpt + ".data_no";
	public static final String $ext_data_no = $accpt + ".ext_data_no";
	public static final String $ext_data_lno = $accpt + ".ext_data_lno";
	public static final String $dlv_slip_no = $accpt + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $accpt + ".dlv_slip_d_no";
	public static final String $cst_po_no = $accpt + ".cst_po_no";
	public static final String $cst_po_d_no = $accpt + ".cst_po_d_no";
	public static final String $cst_cd = $accpt + ".cst_cd";

	public static final MCMeta accpt_META = createInnerRowMeta($accpt, mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R.class);

	protected static final ConstMetaList<AccptRecvIf_Upd03_DtlR> constMetas = new ConstMetaList<AccptRecvIf_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			accpt_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_data_no",
				"ext_data_lno",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"cst_po_no",
				"cst_po_d_no",
				"cst_cd"
			},
			{
				$data_lno,
				$data_no,
				$ext_data_no,
				$ext_data_lno,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$cst_po_no,
				$cst_po_d_no,
				$cst_cd
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
	protected AccptRecvIf_Upd03_DtlR_MC_A(ConstMetaList<? extends AccptRecvIf_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AccptRecvIf_Upd03_DtlR clone() {
		return (AccptRecvIf_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AccptRecvIf_Upd03_DtlR createInstance() {
		return (AccptRecvIf_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AccptRecvIf_Upd03_DtlR getValues(String... names) {
		return (AccptRecvIf_Upd03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R accpt(){
		return (mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R) getConstInnerRow(offset + 0, $accpt);
	}
	
	public void accpt(mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $accpt, row);
	}






	public MCRow getInnerRow(String name) {
		if ($accpt.equalsIgnoreCase(name)) {
			return accpt();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($accpt.equalsIgnoreCase(name)) {
			accpt(
				((MCContainerMeta) accpt_META).castInnerRow(mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R.class, value)
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
		return accpt().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		accpt().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return accpt().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		accpt().data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return accpt().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return accpt().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return accpt().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		accpt().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return accpt().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		accpt().dlv_slip_d_no(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return accpt().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		accpt().cst_po_no(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return accpt().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		accpt().cst_po_d_no(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return accpt().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		accpt().cst_cd(value);
	}

}

