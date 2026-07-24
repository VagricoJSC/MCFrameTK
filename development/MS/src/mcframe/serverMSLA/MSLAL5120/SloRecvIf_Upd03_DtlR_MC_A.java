package mcframe.serverMSLA.MSLAL5120;

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
 * ブロック"SloRecvIf_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SloRecvIf_Upd03_DtlR_MC_A extends MCConstRow {

	public static final String $slo = "slo";

	public static final String $data_lno = $slo + ".data_lno";
	public static final String $data_no = $slo + ".data_no";
	public static final String $ext_data_no = $slo + ".ext_data_no";
	public static final String $ext_data_lno = $slo + ".ext_data_lno";
	public static final String $cst_po_no = $slo + ".cst_po_no";
	public static final String $cst_po_rev = $slo + ".cst_po_rev";
	public static final String $cst_cd = $slo + ".cst_cd";

	public static final MCMeta slo_META = createInnerRowMeta($slo, mcframe.serverMS.dbc.MST_SLO_RECV_IF_R.class);

	protected static final ConstMetaList<SloRecvIf_Upd03_DtlR> constMetas = new ConstMetaList<SloRecvIf_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_data_no",
				"ext_data_lno",
				"cst_po_no",
				"cst_po_rev",
				"cst_cd"
			},
			{
				$data_lno,
				$data_no,
				$ext_data_no,
				$ext_data_lno,
				$cst_po_no,
				$cst_po_rev,
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
	protected SloRecvIf_Upd03_DtlR_MC_A(ConstMetaList<? extends SloRecvIf_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloRecvIf_Upd03_DtlR clone() {
		return (SloRecvIf_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloRecvIf_Upd03_DtlR createInstance() {
		return (SloRecvIf_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloRecvIf_Upd03_DtlR getValues(String... names) {
		return (SloRecvIf_Upd03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_SLO_RECV_IF_R slo(){
		return (mcframe.serverMS.dbc.MST_SLO_RECV_IF_R) getConstInnerRow(offset + 0, $slo);
	}
	
	public void slo(mcframe.serverMS.dbc.MST_SLO_RECV_IF_R row){
		setConstInnerRow(offset + 0, $slo, row);
	}






	public MCRow getInnerRow(String name) {
		if ($slo.equalsIgnoreCase(name)) {
			return slo();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($slo.equalsIgnoreCase(name)) {
			slo(
				((MCContainerMeta) slo_META).castInnerRow(mcframe.serverMS.dbc.MST_SLO_RECV_IF_R.class, value)
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
		return slo().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		slo().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return slo().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		slo().data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return slo().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return slo().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		slo().ext_data_lno(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return slo().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		slo().cst_po_no(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return slo().cst_po_rev();
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return slo().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		slo().cst_cd(value);
	}

}

