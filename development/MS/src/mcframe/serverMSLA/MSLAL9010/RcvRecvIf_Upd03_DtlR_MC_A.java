package mcframe.serverMSLA.MSLAL9010;

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
 * ブロック"RcvRecvIf_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvRecvIf_Upd03_DtlR_MC_A extends MCConstRow {

	public static final String $rcv = "rcv";
	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public static final String $ext_rcv_no = "ext_rcv_no";
	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";

	public static final String $ext_data_no = $rcv + ".ext_data_no";
	public static final String $rcst_cd = $rcv + ".rcst_cd";

	public static final MCMeta rcv_META = createInnerRowMeta($rcv, mcframe.serverMS.dbc.MST_RCV_RECV_IF_R.class);
	public static final MCMeta ext_rcv_no_META = createCommonMeta($ext_rcv_no, mcframe.commonMA.meta.MA_META.EXT_RCV_NO);
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);

	protected static final ConstMetaList<RcvRecvIf_Upd03_DtlR> constMetas = new ConstMetaList<RcvRecvIf_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_META,
			ext_rcv_no_META,
			data_lno_META
		},
		new String[][]{
			{
				"ext_data_no",
				"rcst_cd"
			},
			{
				$ext_data_no,
				$rcst_cd
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
	protected RcvRecvIf_Upd03_DtlR_MC_A(ConstMetaList<? extends RcvRecvIf_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvRecvIf_Upd03_DtlR clone() {
		return (RcvRecvIf_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvRecvIf_Upd03_DtlR createInstance() {
		return (RcvRecvIf_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvRecvIf_Upd03_DtlR getValues(String... names) {
		return (RcvRecvIf_Upd03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_RCV_RECV_IF_R rcv(){
		return (mcframe.serverMS.dbc.MST_RCV_RECV_IF_R) getConstInnerRow(offset + 0, $rcv);
	}
	
	public void rcv(mcframe.serverMS.dbc.MST_RCV_RECV_IF_R row){
		setConstInnerRow(offset + 0, $rcv, row);
	}


	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public String ext_rcv_no() {
		return getConstString(offset + 1, $ext_rcv_no);
	}

	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public void ext_rcv_no(String value) {
		setConstString(offset + 1, $ext_rcv_no, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 2, $data_lno);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 2, $data_lno, value);
	}


	public String getString(String name) {
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			ext_rcv_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			ext_rcv_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcv.equalsIgnoreCase(name)) {
			return rcv();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcv.equalsIgnoreCase(name)) {
			rcv(
				((MCContainerMeta) rcv_META).castInnerRow(mcframe.serverMS.dbc.MST_RCV_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return rcv().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		rcv().ext_data_no(value);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return rcv().rcst_cd();
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		rcv().rcst_cd(value);
	}

}

