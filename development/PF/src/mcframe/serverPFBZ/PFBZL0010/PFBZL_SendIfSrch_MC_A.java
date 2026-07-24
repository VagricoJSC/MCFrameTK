package mcframe.serverPFBZ.PFBZL0010;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "PFBZL_SendIfSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBZL_SendIfSrch_MC_A extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBZ";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBZL0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBZL_SendIfSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.PF_PFBZL0010_Srch01_INFO;
		this.aSrch01 = ((PFBZL_SendIfSrch)this).new Srch01();
	}

	public static PFBZL_SendIfSrch.Srch01 crtSrch01() {
		PFBZL_SendIfSrch lgc = new PFBZL_SendIfSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch01_CndR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
	}
	protected PFBZL_SendIfSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.PF_PFBZL0010_Srch02_INFO;
		this.aSrch02 = ((PFBZL_SendIfSrch)this).new Srch02();
	}

	public static PFBZL_SendIfSrch.Srch02 crtSrch02() {
		PFBZL_SendIfSrch lgc = new PFBZL_SendIfSrch();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_BatchLogKeyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR createSrch02_BatchLogKeyR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR.create();
	}

	/**
	 * Srch02_BatchLogKeyブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR> createSrch02_BatchLogKeyL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR.class);
	}

	/**
	 * Srch02_BatchLogMsgブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR createSrch02_BatchLogMsgR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR.create();
	}

	/**
	 * Srch02_BatchLogMsgブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR> createSrch02_BatchLogMsgL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR.class);
	}
	protected PFBZL_SendIfSrch.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.PF_PFBZL0010_Upd01_INFO;
		this.aUpd01 = ((PFBZL_SendIfSrch)this).new Upd01();
	}

	public static PFBZL_SendIfSrch.Upd01 crtUpd01() {
		PFBZL_SendIfSrch lgc = new PFBZL_SendIfSrch();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createUpd01_DtlR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
	}
	protected PFBZL_SendIfSrch.Conv01 aConv01;

	protected void initConv01() {
		this.info = PDef.PF_PFBZL0010_Conv01_INFO;
		this.aConv01 = ((PFBZL_SendIfSrch)this).new Conv01();
	}

	public static PFBZL_SendIfSrch.Conv01 crtConv01() {
		PFBZL_SendIfSrch lgc = new PFBZL_SendIfSrch();
		lgc.initConv01();
		return lgc.aConv01;
	}

	protected void paramConv01(MCParam p) {
		if (this.aConv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConv01.up0());
	}

	protected void doConv01() {
		aConv01.call();
	};

	/**
	 * Conv01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createConv01_DtlR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
	}

	/**
	 * Conv01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createConv01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
	}
	protected PFBZL_SendIfSrch.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.PF_PFBZL0010_Del01_INFO;
		this.aDel01 = ((PFBZL_SendIfSrch)this).new Del01();
	}

	public static PFBZL_SendIfSrch.Del01 crtDel01() {
		PFBZL_SendIfSrch lgc = new PFBZL_SendIfSrch();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createDel01_DtlR(){
		return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 送信ＩＦ情報を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBZ.PFBZL0010.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> down0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Srch01 （{@link #srch01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション srch01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverPFBZ.PFBZL9050.Srch01_CndR （{@link #srch01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR&gt; （{@link #srch01_down0}）<br>
		 */
		public final mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Srch01 srch01;
		// 連携ロジック上り
		public final mcframe.serverPFBZ.PFBZL9050.Srch01_CndR srch01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> srch01_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZL0010.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);

			// 連携オペレーションの初期化
			srch01 = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtSrch01();
			
			// 連携オペレーションのコンテナ取得
			srch01_up0 = (mcframe.serverPFBZ.PFBZL9050.Srch01_CndR)srch01.up(0);
			srch01_down0 = (MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR>)srch01.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, srch01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverPFBZ.PFBZL9050.Srch01_CndR （{@link #srch01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(srch01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR&gt;（{@link #srch01_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), srch01_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch01_CndR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>notyet_flg</td></tr>
		 * 	<tr><td><br></td><td>send_conv_err_flg</td></tr>
		 * 	<tr><td><br></td><td>send_conv_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>send_err_flg</td></tr>
		 * 	<tr><td><br></td><td>send_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_no_fr</td></tr>
		 * 	<tr><td><br></td><td>data_no_to</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_fr</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_to</td></tr>
		 * 	<tr><td><br></td><td>sdrv_tm_fr</td></tr>
		 * 	<tr><td><br></td><td>sdrv_tm_to</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>ins_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>not_send_flg</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>attr_char1</td></tr>
		 * 	<tr><td><br></td><td>attr_char2</td></tr>
		 * 	<tr><td><br></td><td>attr_char3</td></tr>
		 * 	<tr><td><br></td><td>attr_char4</td></tr>
		 * 	<tr><td><br></td><td>attr_char5</td></tr>
		 * 	<tr><td><br></td><td>attr_char6</td></tr>
		 * 	<tr><td><br></td><td>attr_char7</td></tr>
		 * 	<tr><td><br></td><td>attr_char8</td></tr>
		 * 	<tr><td><br></td><td>attr_char9</td></tr>
		 * 	<tr><td><br></td><td>attr_char10</td></tr>
		 * 	<tr><td><br></td><td>attr_char11</td></tr>
		 * 	<tr><td><br></td><td>attr_char12</td></tr>
		 * 	<tr><td><br></td><td>attr_char13</td></tr>
		 * 	<tr><td><br></td><td>attr_char14</td></tr>
		 * 	<tr><td><br></td><td>attr_char15</td></tr>
		 * 	<tr><td><br></td><td>attr_char16</td></tr>
		 * 	<tr><td><br></td><td>attr_char17</td></tr>
		 * 	<tr><td><br></td><td>attr_char18</td></tr>
		 * 	<tr><td><br></td><td>attr_char19</td></tr>
		 * 	<tr><td><br></td><td>attr_char20</td></tr>
		 * 	<tr><td><br></td><td>attr_char21</td></tr>
		 * 	<tr><td><br></td><td>attr_char22</td></tr>
		 * 	<tr><td><br></td><td>attr_char23</td></tr>
		 * 	<tr><td><br></td><td>attr_char24</td></tr>
		 * 	<tr><td><br></td><td>attr_char25</td></tr>
		 * 	<tr><td><br></td><td>attr_char26</td></tr>
		 * 	<tr><td><br></td><td>attr_char27</td></tr>
		 * 	<tr><td><br></td><td>attr_char28</td></tr>
		 * 	<tr><td><br></td><td>attr_char29</td></tr>
		 * 	<tr><td><br></td><td>attr_char30</td></tr>
		 * 	<tr><td><br></td><td>attr_num1</td></tr>
		 * 	<tr><td><br></td><td>attr_num2</td></tr>
		 * 	<tr><td><br></td><td>attr_num3</td></tr>
		 * 	<tr><td><br></td><td>attr_num4</td></tr>
		 * 	<tr><td><br></td><td>attr_num5</td></tr>
		 * 	<tr><td><br></td><td>attr_dt1_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt1_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt2_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt2_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt3_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt3_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt4_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt4_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt5_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt5_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm1_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm1_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm2_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm2_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm3_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm3_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm4_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm4_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm5_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm5_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZL0010.Srch01_CndR
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.not_send_flg</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_if_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ins_ts</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_tm</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.conv_ope</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.file_io_ope</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.web_api_ope</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.cmd_exec_ope</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_clt_id</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_usr_id</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char6</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char7</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char8</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char9</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char10</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char11</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char12</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char13</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char14</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char15</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char16</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char17</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char18</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char19</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char20</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char21</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char22</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char23</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char24</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char25</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char26</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char27</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char28</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char29</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_char30</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_num5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_dt5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_tm1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_tm2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_tm3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_tm4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.attr_tm5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_id</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverPFBZ.PFBZL9050.Srch01_CndR dest0_0, mcframe.serverPFBZ.PFBZL0010.Srch01_CndR src_Srch01_Cnd){
			up_CALL_OPE_srch01_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理CALL_OPE_srch01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_srch01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_srch01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_srch01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_srch01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("notyet_flg", "notyet_flg");
				addColumnPathMap("send_conv_err_flg", "send_conv_err_flg");
				addColumnPathMap("send_conv_ok_flg", "send_conv_ok_flg");
				addColumnPathMap("send_err_flg", "send_err_flg");
				addColumnPathMap("send_ok_flg", "send_ok_flg");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("data_no_fr", "data_no_fr");
				addColumnPathMap("data_no_to", "data_no_to");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("ins_ts_fr", "ins_ts_fr");
				addColumnPathMap("ins_ts_to", "ins_ts_to");
				addColumnPathMap("sdrv_tm_fr", "sdrv_tm_fr");
				addColumnPathMap("sdrv_tm_to", "sdrv_tm_to");
				addColumnPathMap("file_nm", "file_nm");
				addColumnPathMap("batch_log_no", "batch_log_no");
				addColumnPathMap("ins_srv_req_no", "ins_srv_req_no");
				addColumnPathMap("not_send_flg", "not_send_flg");
				addColumnPathMap("not_send_upd_flg", "not_send_upd_flg");
				addColumnPathMap("attr_char1", "attr_char1");
				addColumnPathMap("attr_char2", "attr_char2");
				addColumnPathMap("attr_char3", "attr_char3");
				addColumnPathMap("attr_char4", "attr_char4");
				addColumnPathMap("attr_char5", "attr_char5");
				addColumnPathMap("attr_char6", "attr_char6");
				addColumnPathMap("attr_char7", "attr_char7");
				addColumnPathMap("attr_char8", "attr_char8");
				addColumnPathMap("attr_char9", "attr_char9");
				addColumnPathMap("attr_char10", "attr_char10");
				addColumnPathMap("attr_char11", "attr_char11");
				addColumnPathMap("attr_char12", "attr_char12");
				addColumnPathMap("attr_char13", "attr_char13");
				addColumnPathMap("attr_char14", "attr_char14");
				addColumnPathMap("attr_char15", "attr_char15");
				addColumnPathMap("attr_char16", "attr_char16");
				addColumnPathMap("attr_char17", "attr_char17");
				addColumnPathMap("attr_char18", "attr_char18");
				addColumnPathMap("attr_char19", "attr_char19");
				addColumnPathMap("attr_char20", "attr_char20");
				addColumnPathMap("attr_char21", "attr_char21");
				addColumnPathMap("attr_char22", "attr_char22");
				addColumnPathMap("attr_char23", "attr_char23");
				addColumnPathMap("attr_char24", "attr_char24");
				addColumnPathMap("attr_char25", "attr_char25");
				addColumnPathMap("attr_char26", "attr_char26");
				addColumnPathMap("attr_char27", "attr_char27");
				addColumnPathMap("attr_char28", "attr_char28");
				addColumnPathMap("attr_char29", "attr_char29");
				addColumnPathMap("attr_char30", "attr_char30");
				addColumnPathMap("attr_num1", "attr_num1");
				addColumnPathMap("attr_num2", "attr_num2");
				addColumnPathMap("attr_num3", "attr_num3");
				addColumnPathMap("attr_num4", "attr_num4");
				addColumnPathMap("attr_num5", "attr_num5");
				addColumnPathMap("attr_dt1_fr", "attr_dt1_fr");
				addColumnPathMap("attr_dt1_to", "attr_dt1_to");
				addColumnPathMap("attr_dt2_fr", "attr_dt2_fr");
				addColumnPathMap("attr_dt2_to", "attr_dt2_to");
				addColumnPathMap("attr_dt3_fr", "attr_dt3_fr");
				addColumnPathMap("attr_dt3_to", "attr_dt3_to");
				addColumnPathMap("attr_dt4_fr", "attr_dt4_fr");
				addColumnPathMap("attr_dt4_to", "attr_dt4_to");
				addColumnPathMap("attr_dt5_fr", "attr_dt5_fr");
				addColumnPathMap("attr_dt5_to", "attr_dt5_to");
				addColumnPathMap("attr_tm1_fr", "attr_tm1_fr");
				addColumnPathMap("attr_tm1_to", "attr_tm1_to");
				addColumnPathMap("attr_tm2_fr", "attr_tm2_fr");
				addColumnPathMap("attr_tm2_to", "attr_tm2_to");
				addColumnPathMap("attr_tm3_fr", "attr_tm3_fr");
				addColumnPathMap("attr_tm3_to", "attr_tm3_to");
				addColumnPathMap("attr_tm4_fr", "attr_tm4_fr");
				addColumnPathMap("attr_tm4_to", "attr_tm4_to");
				addColumnPathMap("attr_tm5_fr", "attr_tm5_fr");
				addColumnPathMap("attr_tm5_to", "attr_tm5_to");
			}
		}

		/**
		 * 連携処理CALL_OPE_srch01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_srch01_0(mcframe.serverPFBZ.PFBZL9050.Srch01_CndR dest, mcframe.serverPFBZ.PFBZL0010.Srch01_CndR src) {
			createMap_up_CALL_OPE_srch01_0().copy(dest, src);
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> dest_Srch01_Dtl, MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> src0_0){
			down_CALL_OPE_srch01_0(dest_Srch01_Dtl, src0_0);
		}

		/**
		 * 連携処理CALL_OPE_srch01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_srch01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_srch01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_srch01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_srch01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sdrvIf.not_send_flg", "sdrvIf.not_send_flg");
				addColumnPathMap("sdrvIf.not_send_upd_flg", "sdrvIf.not_send_upd_flg");
				addColumnPathMap("sdrvIf.if_proc_typ", "sdrvIf.if_proc_typ");
				addColumnPathMap("if_proc_typ_nm", "if_proc_typ_nm");
				addColumnPathMap("sdrvIf.data_no", "sdrvIf.data_no");
				addColumnPathMap("sdrvIf.ext_sys_cd", "sdrvIf.ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("sdrvIf.sdrv_if_rmrks", "sdrvIf.sdrv_if_rmrks");
				addColumnPathMap("sdrvIf.sdrv_sts_typ", "sdrvIf.sdrv_sts_typ");
				addColumnPathMap("sdrv_sts_typ_nm", "sdrv_sts_typ_nm");
				addColumnPathMap("sdrvIf.ins_ts", "sdrvIf.ins_ts");
				addColumnPathMap("sdrvIf.sdrv_tm", "sdrvIf.sdrv_tm");
				addColumnPathMap("sdrvIf.conv_ope", "sdrvIf.conv_ope");
				addColumnPathMap("sdrvIf.file_io_ope", "sdrvIf.file_io_ope");
				addColumnPathMap("sdrvIf.web_api_ope", "sdrvIf.web_api_ope");
				addColumnPathMap("sdrvIf.cmd_exec_ope", "sdrvIf.cmd_exec_ope");
				addColumnPathMap("sdrvIf.sdrv_clt_id", "sdrvIf.sdrv_clt_id");
				addColumnPathMap("sdrvIf.sdrv_usr_id", "sdrvIf.sdrv_usr_id");
				addColumnPathMap("sdrvIf.sdrv_usr_nm", "sdrvIf.sdrv_usr_nm");
				addColumnPathMap("sdrvIf.attr_char1", "sdrvIf.attr_char1");
				addColumnPathMap("sdrvIf.attr_char2", "sdrvIf.attr_char2");
				addColumnPathMap("sdrvIf.attr_char3", "sdrvIf.attr_char3");
				addColumnPathMap("sdrvIf.attr_char4", "sdrvIf.attr_char4");
				addColumnPathMap("sdrvIf.attr_char5", "sdrvIf.attr_char5");
				addColumnPathMap("sdrvIf.attr_char6", "sdrvIf.attr_char6");
				addColumnPathMap("sdrvIf.attr_char7", "sdrvIf.attr_char7");
				addColumnPathMap("sdrvIf.attr_char8", "sdrvIf.attr_char8");
				addColumnPathMap("sdrvIf.attr_char9", "sdrvIf.attr_char9");
				addColumnPathMap("sdrvIf.attr_char10", "sdrvIf.attr_char10");
				addColumnPathMap("sdrvIf.attr_char11", "sdrvIf.attr_char11");
				addColumnPathMap("sdrvIf.attr_char12", "sdrvIf.attr_char12");
				addColumnPathMap("sdrvIf.attr_char13", "sdrvIf.attr_char13");
				addColumnPathMap("sdrvIf.attr_char14", "sdrvIf.attr_char14");
				addColumnPathMap("sdrvIf.attr_char15", "sdrvIf.attr_char15");
				addColumnPathMap("sdrvIf.attr_char16", "sdrvIf.attr_char16");
				addColumnPathMap("sdrvIf.attr_char17", "sdrvIf.attr_char17");
				addColumnPathMap("sdrvIf.attr_char18", "sdrvIf.attr_char18");
				addColumnPathMap("sdrvIf.attr_char19", "sdrvIf.attr_char19");
				addColumnPathMap("sdrvIf.attr_char20", "sdrvIf.attr_char20");
				addColumnPathMap("sdrvIf.attr_char21", "sdrvIf.attr_char21");
				addColumnPathMap("sdrvIf.attr_char22", "sdrvIf.attr_char22");
				addColumnPathMap("sdrvIf.attr_char23", "sdrvIf.attr_char23");
				addColumnPathMap("sdrvIf.attr_char24", "sdrvIf.attr_char24");
				addColumnPathMap("sdrvIf.attr_char25", "sdrvIf.attr_char25");
				addColumnPathMap("sdrvIf.attr_char26", "sdrvIf.attr_char26");
				addColumnPathMap("sdrvIf.attr_char27", "sdrvIf.attr_char27");
				addColumnPathMap("sdrvIf.attr_char28", "sdrvIf.attr_char28");
				addColumnPathMap("sdrvIf.attr_char29", "sdrvIf.attr_char29");
				addColumnPathMap("sdrvIf.attr_char30", "sdrvIf.attr_char30");
				addColumnPathMap("sdrvIf.attr_num1", "sdrvIf.attr_num1");
				addColumnPathMap("sdrvIf.attr_num2", "sdrvIf.attr_num2");
				addColumnPathMap("sdrvIf.attr_num3", "sdrvIf.attr_num3");
				addColumnPathMap("sdrvIf.attr_num4", "sdrvIf.attr_num4");
				addColumnPathMap("sdrvIf.attr_num5", "sdrvIf.attr_num5");
				addColumnPathMap("sdrvIf.attr_dt1", "sdrvIf.attr_dt1");
				addColumnPathMap("sdrvIf.attr_dt2", "sdrvIf.attr_dt2");
				addColumnPathMap("sdrvIf.attr_dt3", "sdrvIf.attr_dt3");
				addColumnPathMap("sdrvIf.attr_dt4", "sdrvIf.attr_dt4");
				addColumnPathMap("sdrvIf.attr_dt5", "sdrvIf.attr_dt5");
				addColumnPathMap("sdrvIf.attr_tm1", "sdrvIf.attr_tm1");
				addColumnPathMap("sdrvIf.attr_tm2", "sdrvIf.attr_tm2");
				addColumnPathMap("sdrvIf.attr_tm3", "sdrvIf.attr_tm3");
				addColumnPathMap("sdrvIf.attr_tm4", "sdrvIf.attr_tm4");
				addColumnPathMap("sdrvIf.attr_tm5", "sdrvIf.attr_tm5");
				addColumnPathMap("sdrvIf.batch_log_no", "sdrvIf.batch_log_no");
				addColumnPathMap("sdrvIf.log_sub_key1", "sdrvIf.log_sub_key1");
				addColumnPathMap("sdrvIf.log_sub_key2", "sdrvIf.log_sub_key2");
				addColumnPathMap("ifFile.file_id", "ifFile.file_id");
				addColumnPathMap("ifFile.file_path", "ifFile.file_path");
				addColumnPathMap("ifFile.file_nm", "ifFile.file_nm");
			}
		}

		/**
		 * 連携処理CALL_OPE_srch01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_srch01_0(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_dest, mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_srch01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_srch01_0(MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> dest, MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_srch01_0();
			for(mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR r_src : src){
				mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_srch01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * バッチログメッセージを検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR.class);
			down0 = MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_BatchLogKeyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR createSrch02_BatchLogKeyR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR.create();
		}

		/**
		 * Srch02_BatchLogKeyブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR> createSrch02_BatchLogKeyL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR.class);
		}

		/**
		 * Srch02_BatchLogMsgブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR createSrch02_BatchLogMsgR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR.create();
		}

		/**
		 * Srch02_BatchLogMsgブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR> createSrch02_BatchLogMsgL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogKeyR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>batch_log_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_log_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>msg_id</td></tr>
		 * 	<tr><td><br></td><td>msg_txt</td></tr>
		 * 	<tr><td><br></td><td>msg_lvl</td></tr>
		 * 	<tr><td><br></td><td>log_ts</td></tr>
		 * 	<tr><td><br></td><td>seq</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch02_BatchLogMsgR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 送受信ＩＦ情報を更新する<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);

			// 連携オペレーションの初期化
			upd01 = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpd01();
			
			// 連携オペレーションのコンテナ取得
			upd01_up0 = (MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(upd01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createUpd01_DtlR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.not_send_flg</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_if_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> dest0_0, MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE_upd01_0(dest0_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sdrvIf.data_no", "sdrvIf.data_no");
				addColumnPathMap("sdrvIf.not_send_flg", "sdrvIf.not_send_flg");
				addColumnPathMap("sdrvIf.not_send_upd_flg", "sdrvIf.not_send_upd_flg");
				addColumnPathMap("sdrvIf.sdrv_if_rmrks", "sdrvIf.sdrv_if_rmrks");
			}
		}

		/**
		 * 連携処理CALL_OPE_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_upd01_0(mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR r_dest, mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_upd01_0(MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> dest, MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_upd01_0();
			for(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_src : src){
				mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(){
		}
	}
	/**
	 * Conv01オペレーション.<p>
	 *
	 * 送受信ＩＦ情報のコードを変換しファイルに出力する<br>
	 */
	abstract public class Conv01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverPFBZ.PFBZB5010.PFBZB_SendDataConv.Upd02 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverPFBZ.PFBZB5010.PFBZB_SendDataConv.Upd02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverPFUD.PFUDL5020.SdrvDtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverPFBZ.PFBZB5010.PFBZB_SendDataConv.Upd02 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Conv01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);

			// 連携オペレーションの初期化
			upd02 = mcframe.serverPFBZ.PFBZB5010.PFBZB_SendDataConv.crtUpd02();
			
			// 連携オペレーションのコンテナ取得
			upd02_up0 = (MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverPFUD.PFUDL5020.SdrvDtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(upd02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Conv01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createConv01_DtlR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
		}

		/**
		 * Conv01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createConv01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> dest0_0, MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> src_Conv01_Dtl){
			up_CALL_OPE_upd02_0(dest0_0, src_Conv01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sdrvIf.if_proc_typ", "sdrvIf.if_proc_typ");
				addColumnPathMap("sdrvIf.data_no", "sdrvIf.data_no");
				addColumnPathMap("sdrvIf.ext_sys_cd", "sdrvIf.ext_sys_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_upd02_0(mcframe.serverPFUD.PFUDL5020.SdrvDtlR r_dest, mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_upd02_0(MCList<mcframe.serverPFUD.PFUDL5020.SdrvDtlR> dest, MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_upd02_0();
			for(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_src : src){
				mcframe.serverPFUD.PFUDL5020.SdrvDtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 変換完了、および送信完了した送信ＩＦ情報を未送信に戻す<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Can01 （{@link #can01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション can01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Can01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverPFBZ.PFBZL9050.Can01_DtlR&gt; （{@link #can01_up0}）<br>
		 */
		public final mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Can01 can01;
		// 連携ロジック上り
		public final MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> can01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);

			// 連携オペレーションの初期化
			can01 = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtCan01();
			
			// 連携オペレーションのコンテナ取得
			can01_up0 = (MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR>)can01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, can01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverPFBZ.PFBZL9050.Can01_DtlR&gt; （{@link #can01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(can01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR createDel01_DtlR(){
			return mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendIfSrch)PFBZL_SendIfSrch_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> dest0_0, MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> src_Del01_Dtl){
			up_CALL_OPE_can01_0(dest0_0, src_Del01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_can01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_can01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_can01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_can01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_can01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sdrvIf.if_proc_typ", "sdrvIf.if_proc_typ");
				addColumnPathMap("sdrvIf.data_no", "sdrvIf.data_no");
				addColumnPathMap("ifFile.file_id", "ifFile.file_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_can01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_can01_0(mcframe.serverPFBZ.PFBZL9050.Can01_DtlR r_dest, mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_can01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_can01_0(MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> dest, MCList<mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_can01_0();
			for(mcframe.serverPFBZ.PFBZL0010.Srch01_DtlR r_src : src){
				mcframe.serverPFBZ.PFBZL9050.Can01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_can01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}