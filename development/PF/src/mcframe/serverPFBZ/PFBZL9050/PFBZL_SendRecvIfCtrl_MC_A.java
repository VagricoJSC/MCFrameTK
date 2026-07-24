package mcframe.serverPFBZ.PFBZL9050;

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
 * "PFBZL_SendRecvIfCtrl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBZL_SendRecvIfCtrl_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String LOGIC_ID = "PFBZL9050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBZL_SendRecvIfCtrl.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.PF_PFBZL9050_Srch01_INFO;
		this.aSrch01 = ((PFBZL_SendRecvIfCtrl)this).new Srch01();
	}

	public static PFBZL_SendRecvIfCtrl.Srch01 crtSrch01() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
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
	public mcframe.serverPFBZ.PFBZL9050.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverPFBZ.PFBZL9050.Srch01_CndR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR.class);
	}
	protected PFBZL_SendRecvIfCtrl.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.PF_PFBZL9050_Srch02_INFO;
		this.aSrch02 = ((PFBZL_SendRecvIfCtrl)this).new Srch02();
	}

	public static PFBZL_SendRecvIfCtrl.Srch02 crtSrch02() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
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
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverPFBZ.PFBZL9050.Srch02_CndR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR createSrch02_DtlR(){
		return mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR.class);
	}
	protected PFBZL_SendRecvIfCtrl.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.PF_PFBZL9050_Ins01_INFO;
		this.aIns01 = ((PFBZL_SendRecvIfCtrl)this).new Ins01();
	}

	public static PFBZL_SendRecvIfCtrl.Ins01 crtIns01() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0030.DtlR createDtlR(){
		return mcframe.serverPFUD.PFUDL0030.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0030.DtlR> createDtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);
	}
	protected PFBZL_SendRecvIfCtrl.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.PF_PFBZL9050_Upd01_INFO;
		this.aUpd01 = ((PFBZL_SendRecvIfCtrl)this).new Upd01();
	}

	public static PFBZL_SendRecvIfCtrl.Upd01 crtUpd01() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
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
	public mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR createUpd01_DtlR(){
		return mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR.class);
	}
	protected PFBZL_SendRecvIfCtrl.UpdEsb01 aUpdEsb01;

	protected void initUpdEsb01() {
		this.info = PDef.PF_PFBZL9050_UpdEsb01_INFO;
		this.aUpdEsb01 = ((PFBZL_SendRecvIfCtrl)this).new UpdEsb01();
	}

	public static PFBZL_SendRecvIfCtrl.UpdEsb01 crtUpdEsb01() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
		lgc.initUpdEsb01();
		return lgc.aUpdEsb01;
	}

	protected void paramUpdEsb01(MCParam p) {
		if (this.aUpdEsb01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpdEsb01.up0());
	}

	protected void doUpdEsb01() {
		aUpdEsb01.call();
	};

	/**
	 * UpdEsb01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR createUpdEsb01_DtlR(){
		return mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR.create();
	}

	/**
	 * UpdEsb01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR> createUpdEsb01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR.class);
	}
	protected PFBZL_SendRecvIfCtrl.UpdWk01 aUpdWk01;

	protected void initUpdWk01() {
		this.info = PDef.PF_PFBZL9050_UpdWk01_INFO;
		this.aUpdWk01 = ((PFBZL_SendRecvIfCtrl)this).new UpdWk01();
	}

	public static PFBZL_SendRecvIfCtrl.UpdWk01 crtUpdWk01() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
		lgc.initUpdWk01();
		return lgc.aUpdWk01;
	}

	protected void paramUpdWk01(MCParam p) {
		if (this.aUpdWk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpdWk01.up0());
	}

	protected void doUpdWk01() {
		aUpdWk01.call();
	};

	/**
	 * UpdWk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR createUpdWk01_DtlR(){
		return mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR.create();
	}

	/**
	 * UpdWk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR> createUpdWk01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR.class);
	}
	protected PFBZL_SendRecvIfCtrl.Can01 aCan01;

	protected void initCan01() {
		this.info = PDef.PF_PFBZL9050_Can01_INFO;
		this.aCan01 = ((PFBZL_SendRecvIfCtrl)this).new Can01();
	}

	public static PFBZL_SendRecvIfCtrl.Can01 crtCan01() {
		PFBZL_SendRecvIfCtrl lgc = new PFBZL_SendRecvIfCtrl();
		lgc.initCan01();
		return lgc.aCan01;
	}

	protected void paramCan01(MCParam p) {
		if (this.aCan01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCan01.up0());
	}

	protected void doCan01() {
		aCan01.call();
	};

	/**
	 * Can01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.Can01_DtlR createCan01_DtlR(){
		return mcframe.serverPFBZ.PFBZL9050.Can01_DtlR.create();
	}

	/**
	 * Can01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> createCan01_DtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL9050.Can01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
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
		private final mcframe.serverPFBZ.PFBZL9050.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZL9050.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR.class);

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
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverPFBZ.PFBZL9050.Srch01_CndR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR.class);
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
		 * 	<tr><td><br></td><td>recv_err_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_conv_err_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_conv_ok_flg</td></tr>
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
		 * 	<tr><td><br></td><td>batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZL9050.Srch01_CndR
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>real_imp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.Srch01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
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
		private final mcframe.serverPFBZ.PFBZL9050.Srch02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZL9050.Srch02_CndR.create();
			down0 = MCList.create(mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR.class);

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
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverPFBZ.PFBZL9050.Srch02_CndR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR createSrch02_DtlR(){
			return mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZL9050.Srch02_CndR
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.sdrv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_id</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_path</td></tr>
		 * 	<tr><td><br></td><td>ifFile.file_nm</td></tr>
		 * 	<tr><td><br></td><td>remote_dir</td></tr>
		 * 	<tr><td><br></td><td>transfer_lock_typ</td></tr>
		 * 	<tr><td><br></td><td>sts_fsuffix</td></tr>
		 * 	<tr><td><br></td><td>ftp_host</td></tr>
		 * 	<tr><td><br></td><td>ftp_user</td></tr>
		 * 	<tr><td><br></td><td>ftp_password</td></tr>
		 * 	<tr><td><br></td><td>ftp_port</td></tr>
		 * 	<tr><td><br></td><td>ftp_mode</td></tr>
		 * 	<tr><td><br></td><td>ftp_opts</td></tr>
		 * 	<tr><td><br></td><td>sftp_host</td></tr>
		 * 	<tr><td><br></td><td>sftp_user</td></tr>
		 * 	<tr><td><br></td><td>sftp_password</td></tr>
		 * 	<tr><td><br></td><td>sftp_port</td></tr>
		 * 	<tr><td><br></td><td>sftp_key_file_path</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.Srch02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0030.DtlR> up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0030.DtlR createDtlR(){
			return mcframe.serverPFUD.PFUDL0030.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0030.DtlR> createDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sdrv_clt_id</td></tr>
		 * 	<tr><td><br></td><td>sdrv_usr_id</td></tr>
		 * 	<tr><td><br></td><td>sdrv_usr_nm</td></tr>
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
		 * 	<tr><td><br></td><td>attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>attr_dt5</td></tr>
		 * 	<tr><td><br></td><td>attr_tm1</td></tr>
		 * 	<tr><td><br></td><td>attr_tm2</td></tr>
		 * 	<tr><td><br></td><td>attr_tm3</td></tr>
		 * 	<tr><td><br></td><td>attr_tm4</td></tr>
		 * 	<tr><td><br></td><td>attr_tm5</td></tr>
		 * 	<tr><td><br></td><td>webapi_not_link_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0030.DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR createUpd01_DtlR(){
			return mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR.class);
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
		public MCList<mcframe.serverPFBZ.PFBZL9050.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}
	/**
	 * UpdEsb01オペレーション.<p>
	 *
	 */
	abstract public class UpdEsb01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UpdEsb01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR> up0;
		
		
		// コンストラクタ
		protected UpdEsb01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * UpdEsb01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR createUpdEsb01_DtlR(){
			return mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR.create();
		}

		/**
		 * UpdEsb01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR> createUpdEsb01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.UpdEsb01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}
	/**
	 * UpdWk01オペレーション.<p>
	 *
	 */
	abstract public class UpdWk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UpdWk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR> up0;
		
		
		// コンストラクタ
		protected UpdWk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * UpdWk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR createUpdWk01_DtlR(){
			return mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR.create();
		}

		/**
		 * UpdWk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR> createUpdWk01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.data_no</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.sdrv_clt_id</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.sdrv_usr_id</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.sdrv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char6</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char7</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char8</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char9</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char10</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char11</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char12</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char13</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char14</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char15</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char16</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char17</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char18</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char19</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char20</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char21</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char22</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char23</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char24</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char25</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char26</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char27</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char28</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char29</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_char30</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_num1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_num2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_num3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_num4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_num5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_dt5</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_tm1</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_tm2</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_tm3</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_tm4</td></tr>
		 * 	<tr><td><br></td><td>sdrvIfWk.attr_tm5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}
	/**
	 * Can01オペレーション.<p>
	 *
	 */
	abstract public class Can01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Can01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> up0;
		
		
		// コンストラクタ
		protected Can01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFBZ.PFBZL9050.Can01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Can01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Can01_DtlR createCan01_DtlR(){
			return mcframe.serverPFBZ.PFBZL9050.Can01_DtlR.create();
		}

		/**
		 * Can01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> createCan01_DtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL9050.Can01_DtlR.class);
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
		public MCList<mcframe.serverPFBZ.PFBZL9050.Can01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_SendRecvIfCtrl)PFBZL_SendRecvIfCtrl_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}