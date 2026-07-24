package mcframe.serverMSLA.MSLAL6060;

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
 * ブロック"XfrActRecvIf_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrActRecvIf_Upd03_DtlR_MC_A extends MCConstRow {

	public static final String $xa = "xa";

	public static final String $data_lno = $xa + ".data_lno";
	public static final String $data_no = $xa + ".data_no";
	public static final String $data_crud_typ = $xa + ".data_crud_typ";
	public static final String $exe_sts_typ = $xa + ".exe_sts_typ";
	public static final String $ext_sys_cd = $xa + ".ext_sys_cd";
	public static final String $ext_data_lno = $xa + ".ext_data_lno";
	public static final String $ext_data_no = $xa + ".ext_data_no";
	public static final String $data_make_dt = $xa + ".data_make_dt";
	public static final String $imp_flg = $xa + ".imp_flg";
	public static final String $lg_grp_cd = $xa + ".lg_grp_cd";

	public static final MCMeta xa_META = createInnerRowMeta($xa, mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R.class);

	protected static final ConstMetaList<XfrActRecvIf_Upd03_DtlR> constMetas = new ConstMetaList<XfrActRecvIf_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xa_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"exe_sts_typ",
				"ext_sys_cd",
				"ext_data_lno",
				"ext_data_no",
				"data_make_dt",
				"imp_flg",
				"lg_grp_cd"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$exe_sts_typ,
				$ext_sys_cd,
				$ext_data_lno,
				$ext_data_no,
				$data_make_dt,
				$imp_flg,
				$lg_grp_cd
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
	protected XfrActRecvIf_Upd03_DtlR_MC_A(ConstMetaList<? extends XfrActRecvIf_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActRecvIf_Upd03_DtlR clone() {
		return (XfrActRecvIf_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActRecvIf_Upd03_DtlR createInstance() {
		return (XfrActRecvIf_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActRecvIf_Upd03_DtlR getValues(String... names) {
		return (XfrActRecvIf_Upd03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R xa(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R) getConstInnerRow(offset + 0, $xa);
	}
	
	public void xa(mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $xa, row);
	}






	public MCRow getInnerRow(String name) {
		if ($xa.equalsIgnoreCase(name)) {
			return xa();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xa.equalsIgnoreCase(name)) {
			xa(
				((MCContainerMeta) xa_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_RECV_IF_R.class, value)
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
		return xa().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		xa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		xa().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return xa().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		xa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		xa().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return xa().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		xa().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return xa().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		xa().exe_sts_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return xa().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		xa().ext_sys_cd(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return xa().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		xa().ext_data_lno(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return xa().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		xa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		xa().ext_data_no(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return xa().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		xa().data_make_dt(value);
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public boolean imp_flg() {
		return xa().imp_flg();
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		xa().imp_flg(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xa().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xa().lg_grp_cd(value);
	}

}

