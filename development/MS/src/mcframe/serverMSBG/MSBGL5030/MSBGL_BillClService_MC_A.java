package mcframe.serverMSBG.MSBGL5030;

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
 * "MSBGL_BillClService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_BillClService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBGL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_BillClService.BillCl_Upd01 aBillCl_Upd01;

	protected void initBillCl_Upd01() {
		this.info = PDef.MS_MSBGL5030_BillCl_Upd01_INFO;
		this.aBillCl_Upd01 = ((MSBGL_BillClService)this).new BillCl_Upd01();
	}

	public static MSBGL_BillClService.BillCl_Upd01 crtBillCl_Upd01() {
		MSBGL_BillClService lgc = new MSBGL_BillClService();
		lgc.initBillCl_Upd01();
		return lgc.aBillCl_Upd01;
	}

	protected void paramBillCl_Upd01(MCParam p) {
		if (this.aBillCl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillCl_Upd01.up0());
	}

	protected void doBillCl_Upd01() {
		aBillCl_Upd01.call();
	};

	/**
	 * BillCl_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR createBillCl_Upd01_CndR(){
		return mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR.create();
	}
	protected MSBGL_BillClService.BillCl_Upd02 aBillCl_Upd02;

	protected void initBillCl_Upd02() {
		this.info = PDef.MS_MSBGL5030_BillCl_Upd02_INFO;
		this.aBillCl_Upd02 = ((MSBGL_BillClService)this).new BillCl_Upd02();
	}

	public static MSBGL_BillClService.BillCl_Upd02 crtBillCl_Upd02() {
		MSBGL_BillClService lgc = new MSBGL_BillClService();
		lgc.initBillCl_Upd02();
		return lgc.aBillCl_Upd02;
	}

	protected void paramBillCl_Upd02(MCParam p) {
		if (this.aBillCl_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillCl_Upd02.up0());
		p.addDownBlock(aBillCl_Upd02.down0());
	}

	protected void doBillCl_Upd02() {
		aBillCl_Upd02.call();
	};

	/**
	 * BillCl_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR createBillCl_Upd02_HdrR(){
		return mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR.create();
	}

	/**
	 * BillCl_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR> createBillCl_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR.class);
	}

	/**
	 * AddBillInfoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5030.AddBillInfoR createAddBillInfoR(){
		return mcframe.serverMSBG.MSBGL5030.AddBillInfoR.create();
	}
	protected MSBGL_BillClService.BillCl_Upd03 aBillCl_Upd03;

	protected void initBillCl_Upd03() {
		this.info = PDef.MS_MSBGL5030_BillCl_Upd03_INFO;
		this.aBillCl_Upd03 = ((MSBGL_BillClService)this).new BillCl_Upd03();
	}

	public static MSBGL_BillClService.BillCl_Upd03 crtBillCl_Upd03() {
		MSBGL_BillClService lgc = new MSBGL_BillClService();
		lgc.initBillCl_Upd03();
		return lgc.aBillCl_Upd03;
	}

	protected void paramBillCl_Upd03(MCParam p) {
		if (this.aBillCl_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillCl_Upd03.up0());
		p.addDownBlock(aBillCl_Upd03.down0());
	}

	protected void doBillCl_Upd03() {
		aBillCl_Upd03.call();
	};

	/**
	 * BillCl_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR createBillCl_Upd03_CndR(){
		return mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR.create();
	}

	/**
	 * BillCl_Upd03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR> createBillCl_Upd03_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR.class);
	}

	/**
	 * BillCl_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR createBillCl_Upd03_RsltR(){
		return mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR.create();
	}

	/**
	 * BillCl_Upd03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR> createBillCl_Upd03_RsltL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR.class);
	}
	protected MSBGL_BillClService.BillCl_Del01 aBillCl_Del01;

	protected void initBillCl_Del01() {
		this.info = PDef.MS_MSBGL5030_BillCl_Del01_INFO;
		this.aBillCl_Del01 = ((MSBGL_BillClService)this).new BillCl_Del01();
	}

	public static MSBGL_BillClService.BillCl_Del01 crtBillCl_Del01() {
		MSBGL_BillClService lgc = new MSBGL_BillClService();
		lgc.initBillCl_Del01();
		return lgc.aBillCl_Del01;
	}

	protected void paramBillCl_Del01(MCParam p) {
		if (this.aBillCl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillCl_Del01.up0());
	}

	protected void doBillCl_Del01() {
		aBillCl_Del01.call();
	};

	/**
	 * BillCl_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR createBillCl_Del01_CndR(){
		return mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR.create();
	}

	/**
	 * BillCl_Del01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR> createBillCl_Del01_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BillCl_Upd01オペレーション.<p>
	 *
	 * バッチ用の請求締処理(BillCl_Upd03)を起動する<br>
	 */
	abstract public class BillCl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillCl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected BillCl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR.create();

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
			invoke((MSBGL_BillClService)MSBGL_BillClService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BillCl_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR createBillCl_Upd01_CndR(){
			return mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR
		 */
		public mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillClService)MSBGL_BillClService_MC_A.this).info;
		}


	}
	/**
	 * BillCl_Upd02オペレーション.<p>
	 *
	 * 画面用の請求締処理<br>
	 */
	abstract public class BillCl_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillCl_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR> down0;
		/** [AddBillInfo]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5030.AddBillInfoR aAddBillInfo;
		
		
		// コンストラクタ
		protected BillCl_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR.class);
			aAddBillInfo = mcframe.serverMSBG.MSBGL5030.AddBillInfoR.create();

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
			invoke((MSBGL_BillClService)MSBGL_BillClService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BillCl_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR createBillCl_Upd02_HdrR(){
			return mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR.create();
		}

		/**
		 * BillCl_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR> createBillCl_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR.class);
		}

		/**
		 * AddBillInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5030.AddBillInfoR createAddBillInfoR(){
			return mcframe.serverMSBG.MSBGL5030.AddBillInfoR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>bill_d_sel_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd02_HdrR> down0() {
			return down0;
		}


		/**
		 * [AddBillInfo]ブロックのコンテナaAddBillInfoRを返します。
		 *
		 * @return AddBillInfoR
		 */
		public mcframe.serverMSBG.MSBGL5030.AddBillInfoR AddBillInfo() {
			return aAddBillInfo;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillClService)MSBGL_BillClService_MC_A.this).info;
		}


	}
	/**
	 * BillCl_Upd03オペレーション.<p>
	 *
	 * バッチ用の請求締処理<br>
	 */
	abstract public class BillCl_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillCl_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR> down0;
		
		
		// コンストラクタ
		protected BillCl_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR.class);

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
			invoke((MSBGL_BillClService)MSBGL_BillClService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BillCl_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR createBillCl_Upd03_CndR(){
			return mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR.create();
		}

		/**
		 * BillCl_Upd03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR> createBillCl_Upd03_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR.class);
		}

		/**
		 * BillCl_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR createBillCl_Upd03_RsltR(){
			return mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR.create();
		}

		/**
		 * BillCl_Upd03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR> createBillCl_Upd03_RsltL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>success_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Upd03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillClService)MSBGL_BillClService_MC_A.this).info;
		}


	}
	/**
	 * BillCl_Del01オペレーション.<p>
	 *
	 * 請求締解除を行う<br>
	 */
	abstract public class BillCl_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillCl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR> up0;
		
		
		// コンストラクタ
		protected BillCl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR.class);

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
			invoke((MSBGL_BillClService)MSBGL_BillClService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BillCl_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR createBillCl_Del01_CndR(){
			return mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR.create();
		}

		/**
		 * BillCl_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR> createBillCl_Del01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5030.BillCl_Del01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillClService)MSBGL_BillClService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}