package mcframe.serverMSBG.MSBGL5050;

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
 * "MSBGL_ArSlipPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_ArSlipPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_ArSlipPrntService.ArSlip_Prnt01 aArSlip_Prnt01;

	protected void initArSlip_Prnt01() {
		this.info = PDef.MS_MSBGL5050_ArSlip_Prnt01_INFO;
		this.aArSlip_Prnt01 = ((MSBGL_ArSlipPrntService)this).new ArSlip_Prnt01();
	}

	public static MSBGL_ArSlipPrntService.ArSlip_Prnt01 crtArSlip_Prnt01() {
		MSBGL_ArSlipPrntService lgc = new MSBGL_ArSlipPrntService();
		lgc.initArSlip_Prnt01();
		return lgc.aArSlip_Prnt01;
	}

	protected void paramArSlip_Prnt01(MCParam p) {
		if (this.aArSlip_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArSlip_Prnt01.up0());
		p.addUpBlock(aArSlip_Prnt01.up1());
		p.addDownBlock(aArSlip_Prnt01.down0());
	}

	protected void doArSlip_Prnt01() {
		aArSlip_Prnt01.call();
	};

	/**
	 * ArSlip_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR createArSlip_Prnt01_HdrR(){
		return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR.create();
	}

	/**
	 * ArSlip_Prnt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR> createArSlip_Prnt01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR.class);
	}

	/**
	 * ArSlip_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR createArSlip_Prnt01_CndR(){
		return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR.create();
	}
	protected MSBGL_ArSlipPrntService.ArSlip_Prnt02 aArSlip_Prnt02;

	protected void initArSlip_Prnt02() {
		this.info = PDef.MS_MSBGL5050_ArSlip_Prnt02_INFO;
		this.aArSlip_Prnt02 = ((MSBGL_ArSlipPrntService)this).new ArSlip_Prnt02();
	}

	public static MSBGL_ArSlipPrntService.ArSlip_Prnt02 crtArSlip_Prnt02() {
		MSBGL_ArSlipPrntService lgc = new MSBGL_ArSlipPrntService();
		lgc.initArSlip_Prnt02();
		return lgc.aArSlip_Prnt02;
	}

	protected void paramArSlip_Prnt02(MCParam p) {
		if (this.aArSlip_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArSlip_Prnt02.up0());
		p.addUpBlock(aArSlip_Prnt02.up1());
		p.addDownBlock(aArSlip_Prnt02.down0());
	}

	protected void doArSlip_Prnt02() {
		aArSlip_Prnt02.call();
	};

	/**
	 * ArSlip_Prnt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR createArSlip_Prnt02_HdrR(){
		return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR.create();
	}

	/**
	 * ArSlip_Prnt02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR> createArSlip_Prnt02_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR.class);
	}

	/**
	 * ArSlip_Prnt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR createArSlip_Prnt02_CndR(){
		return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ArSlip_Prnt01オペレーション.<p>
	 *
	 * 債権伝票を発行します。<br>
	 */
	abstract public class ArSlip_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArSlip_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR> down0;
		
		
		// コンストラクタ
		protected ArSlip_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR.class);
			up1 = mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_ArSlipPrntService)MSBGL_ArSlipPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArSlip_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR createArSlip_Prnt01_HdrR(){
			return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR.create();
		}

		/**
		 * ArSlip_Prnt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR> createArSlip_Prnt01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR.class);
		}

		/**
		 * ArSlip_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR createArSlip_Prnt01_CndR(){
			return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR
		 */
		public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArSlipPrntService)MSBGL_ArSlipPrntService_MC_A.this).info;
		}


	}
	/**
	 * ArSlip_Prnt02オペレーション.<p>
	 *
	 * 入金管理票を発行します。<br>
	 */
	abstract public class ArSlip_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArSlip_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR> down0;
		
		
		// コンストラクタ
		protected ArSlip_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR.class);
			up1 = mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR.create();
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_ArSlipPrntService)MSBGL_ArSlipPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArSlip_Prnt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR createArSlip_Prnt02_HdrR(){
			return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR.create();
		}

		/**
		 * ArSlip_Prnt02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR> createArSlip_Prnt02_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR.class);
		}

		/**
		 * ArSlip_Prnt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR createArSlip_Prnt02_CndR(){
			return mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR
		 */
		public mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArSlipPrntService)MSBGL_ArSlipPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}