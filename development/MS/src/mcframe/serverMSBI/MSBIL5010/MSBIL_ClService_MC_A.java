package mcframe.serverMSBI.MSBIL5010;

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
 * "MSBIL_ClService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBIL_ClService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBI";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBIL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBIL_ClService.Cl_Chk01 aCl_Chk01;

	protected void initCl_Chk01() {
		this.info = PDef.MS_MSBIL5010_Cl_Chk01_INFO;
		this.aCl_Chk01 = ((MSBIL_ClService)this).new Cl_Chk01();
	}

	public static MSBIL_ClService.Cl_Chk01 crtCl_Chk01() {
		MSBIL_ClService lgc = new MSBIL_ClService();
		lgc.initCl_Chk01();
		return lgc.aCl_Chk01;
	}

	protected void paramCl_Chk01(MCParam p) {
		if (this.aCl_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCl_Chk01.up0());
		p.addUpBlock(aCl_Chk01.up1());
		p.addUpBlock(aCl_Chk01.up2());
		p.addDownBlock(aCl_Chk01.down0());
	}

	protected void doCl_Chk01() {
		aCl_Chk01.call();
	};

	/**
	 * Cl_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR createCl_Chk01_HdrR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
	}

	/**
	 * Cl_Chk01_ArブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR createCl_Chk01_ArR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.create();
	}

	/**
	 * Cl_Chk01_ArブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> createCl_Chk01_ArL(){
		return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
	}

	/**
	 * Cl_Chk01_ApブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR createCl_Chk01_ApR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.create();
	}

	/**
	 * Cl_Chk01_ApブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> createCl_Chk01_ApL(){
		return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);
	}
	protected MSBIL_ClService.Cl_Chk03 aCl_Chk03;

	protected void initCl_Chk03() {
		this.info = PDef.MS_MSBIL5010_Cl_Chk03_INFO;
		this.aCl_Chk03 = ((MSBIL_ClService)this).new Cl_Chk03();
	}

	public static MSBIL_ClService.Cl_Chk03 crtCl_Chk03() {
		MSBIL_ClService lgc = new MSBIL_ClService();
		lgc.initCl_Chk03();
		return lgc.aCl_Chk03;
	}

	protected void paramCl_Chk03(MCParam p) {
		if (this.aCl_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCl_Chk03.up0());
		p.addUpBlock(aCl_Chk03.up1());
		p.addUpBlock(aCl_Chk03.up2());
		p.addDownBlock(aCl_Chk03.down0());
		p.addDownBlock(aCl_Chk03.down1());
	}

	protected void doCl_Chk03() {
		aCl_Chk03.call();
	};

	/**
	 * Cl_Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR createCl_Chk03_CndR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR.create();
	}

	/**
	 * Cl_Chk03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR> createCl_Chk03_CndL(){
		return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR.class);
	}

	/**
	 * Cl_Chk03_CndHdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR createCl_Chk03_CndHdrR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR.create();
	}

	/**
	 * Cl_Chk03_CndBpブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR createCl_Chk03_CndBpR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR.create();
	}

	/**
	 * Cl_Chk03_CndBpブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR> createCl_Chk03_CndBpL(){
		return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR.class);
	}
	protected MSBIL_ClService.Cl_Upd01 aCl_Upd01;

	protected void initCl_Upd01() {
		this.info = PDef.MS_MSBIL5010_Cl_Upd01_INFO;
		this.aCl_Upd01 = ((MSBIL_ClService)this).new Cl_Upd01();
	}

	public static MSBIL_ClService.Cl_Upd01 crtCl_Upd01() {
		MSBIL_ClService lgc = new MSBIL_ClService();
		lgc.initCl_Upd01();
		return lgc.aCl_Upd01;
	}

	protected void paramCl_Upd01(MCParam p) {
		if (this.aCl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCl_Upd01.up0());
		p.addUpBlock(aCl_Upd01.up1());
		p.addUpBlock(aCl_Upd01.up2());
		p.addDownBlock(aCl_Upd01.down0());
		p.addDownBlock(aCl_Upd01.down1());
		p.addDownBlock(aCl_Upd01.down2());
	}

	protected void doCl_Upd01() {
		aCl_Upd01.call();
	};

	/**
	 * Cl_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR createCl_Upd01_HdrR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
	}

	/**
	 * Cl_Upd01_ArブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR createCl_Upd01_ArR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.create();
	}

	/**
	 * Cl_Upd01_ArブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> createCl_Upd01_ArL(){
		return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
	}

	/**
	 * StkXfrAct_Ins01_DtlDownブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR createStkXfrAct_Ins01_DtlDownR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.create();
	}

	/**
	 * StkXfrAct_Ins01_DtlDownブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> createStkXfrAct_Ins01_DtlDownL(){
		return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);
	}
	protected MSBIL_ClService.Cl_Srch01 aCl_Srch01;

	protected void initCl_Srch01() {
		this.info = PDef.MS_MSBIL5010_Cl_Srch01_INFO;
		this.aCl_Srch01 = ((MSBIL_ClService)this).new Cl_Srch01();
	}

	public static MSBIL_ClService.Cl_Srch01 crtCl_Srch01() {
		MSBIL_ClService lgc = new MSBIL_ClService();
		lgc.initCl_Srch01();
		return lgc.aCl_Srch01;
	}

	protected void paramCl_Srch01(MCParam p) {
		if (this.aCl_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aCl_Srch01.down0());
	}

	protected void doCl_Srch01() {
		aCl_Srch01.call();
	};

	/**
	 * Cl_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR createCl_Srch01_RsltR(){
		return mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Cl_Chk01オペレーション.<p>
	 *
	 * 締処理前チェックを行う<br>
	 */
	abstract public class Cl_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cl_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR down0;
		
		
		// コンストラクタ
		protected Cl_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
			up2 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);
			down0 = mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_ClService)MSBIL_ClService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Cl_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR createCl_Chk01_HdrR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
		}

		/**
		 * Cl_Chk01_ArブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR createCl_Chk01_ArR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.create();
		}

		/**
		 * Cl_Chk01_ArブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> createCl_Chk01_ArL(){
			return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
		}

		/**
		 * Cl_Chk01_ApブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR createCl_Chk01_ApR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.create();
		}

		/**
		 * Cl_Chk01_ApブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> createCl_Chk01_ApL(){
			return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_asppl_pre_cl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_asppl_pre_cl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_ClService)MSBIL_ClService_MC_A.this).info;
		}


	}
	/**
	 * Cl_Chk03オペレーション.<p>
	 *
	 * 売上、入金、支払、仕入、在庫のどの締チェックを行うか指定して締日チェックを行う。<br>
	 */
	abstract public class Cl_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cl_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR> down1;
		
		
		// コンストラクタ
		protected Cl_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR.class);
			up1 = mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR.create();
			up2 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR.class);
			down0 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR.class);
			down1 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_ClService)MSBIL_ClService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Cl_Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR createCl_Chk03_CndR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR.create();
		}

		/**
		 * Cl_Chk03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR> createCl_Chk03_CndL(){
			return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR.class);
		}

		/**
		 * Cl_Chk03_CndHdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR createCl_Chk03_CndHdrR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR.create();
		}

		/**
		 * Cl_Chk03_CndBpブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR createCl_Chk03_CndBpR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR.create();
		}

		/**
		 * Cl_Chk03_CndBpブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR> createCl_Chk03_CndBpL(){
			return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>io_lmt_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>old_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>no_msg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndHdrR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>old_bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cls_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>io_lmt_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>old_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>old_bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_ClService)MSBIL_ClService_MC_A.this).info;
		}


	}
	/**
	 * Cl_Upd01オペレーション.<p>
	 *
	 * 締処理を行う<br>
	 */
	abstract public class Cl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> down2;
		
		
		// コンストラクタ
		protected Cl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
			up2 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);
			down0 = mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
			down2 = MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_ClService)MSBIL_ClService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Cl_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR createCl_Upd01_HdrR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR.create();
		}

		/**
		 * Cl_Upd01_ArブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR createCl_Upd01_ArR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.create();
		}

		/**
		 * Cl_Upd01_ArブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> createCl_Upd01_ArL(){
			return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR.class);
		}

		/**
		 * StkXfrAct_Ins01_DtlDownブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR createStkXfrAct_Ins01_DtlDownR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.create();
		}

		/**
		 * StkXfrAct_Ins01_DtlDownブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> createStkXfrAct_Ins01_DtlDownL(){
			return MCList.create(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_asppl_pre_cl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_ClService)MSBIL_ClService_MC_A.this).info;
		}


	}
	/**
	 * Cl_Srch01オペレーション.<p>
	 *
	 * 本日締処理対象を取得する<br>
	 */
	abstract public class Cl_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cl_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR down0;
		
		
		// コンストラクタ
		protected Cl_Srch01() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR.create();

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_ClService)MSBIL_ClService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Cl_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR createCl_Srch01_RsltR(){
			return mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR
		 */
		public mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_ClService)MSBIL_ClService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}