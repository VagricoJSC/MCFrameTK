package mcframe.serverMSBG.MSBGL5040;

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
 * "MSBGL_BillPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_BillPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBGL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_BillPrntService.Bill_Prnt01 aBill_Prnt01;

	protected void initBill_Prnt01() {
		this.info = PDef.MS_MSBGL5040_Bill_Prnt01_INFO;
		this.aBill_Prnt01 = ((MSBGL_BillPrntService)this).new Bill_Prnt01();
	}

	public static MSBGL_BillPrntService.Bill_Prnt01 crtBill_Prnt01() {
		MSBGL_BillPrntService lgc = new MSBGL_BillPrntService();
		lgc.initBill_Prnt01();
		return lgc.aBill_Prnt01;
	}

	protected void paramBill_Prnt01(MCParam p) {
		if (this.aBill_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBill_Prnt01.up0());
		p.addUpBlock(aBill_Prnt01.up1());
		p.addDownBlock(aBill_Prnt01.down0());
	}

	protected void doBill_Prnt01() {
		aBill_Prnt01.call();
	};

	/**
	 * Bill_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR createBill_Prnt01_HdrR(){
		return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR.create();
	}

	/**
	 * Bill_Prnt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR> createBill_Prnt01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR.class);
	}

	/**
	 * Bill_Prnt01_HdrBaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR createBill_Prnt01_HdrBaseR(){
		return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR.create();
	}

	/**
	 * Bill_Prnt01_HdrBaseブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR> createBill_Prnt01_HdrBaseL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR.class);
	}

	/**
	 * Bill_Prnt01_DtlBaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR createBill_Prnt01_DtlBaseR(){
		return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR.create();
	}

	/**
	 * Bill_Prnt01_DtlBaseブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR> createBill_Prnt01_DtlBaseL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR.class);
	}

	/**
	 * Bill_Prnt01_BpブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR createBill_Prnt01_BpR(){
		return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR.create();
	}

	/**
	 * Bill_Prnt01_BpブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR> createBill_Prnt01_BpL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR.class);
	}

	/**
	 * Bill_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR createBill_Prnt01_CndR(){
		return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Bill_Prnt01オペレーション.<p>
	 *
	 * 請求書を発行する。<br>
	 */
	abstract public class Bill_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bill_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR> down0;
		/** [Bill_Prnt01_Bp]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR> aBill_Prnt01_Bp;
		/** [Bill_Prnt01_DtlBase]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR> aBill_Prnt01_DtlBase;
		/** [Bill_Prnt01_HdrBase]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR> aBill_Prnt01_HdrBase;
		
		
		// コンストラクタ
		protected Bill_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR.class);
			up1 = mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR.class);
			aBill_Prnt01_Bp = MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR.class);
			aBill_Prnt01_DtlBase = MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR.class);
			aBill_Prnt01_HdrBase = MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR.class);

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
			invoke((MSBGL_BillPrntService)MSBGL_BillPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Bill_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR createBill_Prnt01_HdrR(){
			return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR.create();
		}

		/**
		 * Bill_Prnt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR> createBill_Prnt01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR.class);
		}

		/**
		 * Bill_Prnt01_HdrBaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR createBill_Prnt01_HdrBaseR(){
			return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR.create();
		}

		/**
		 * Bill_Prnt01_HdrBaseブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR> createBill_Prnt01_HdrBaseL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR.class);
		}

		/**
		 * Bill_Prnt01_DtlBaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR createBill_Prnt01_DtlBaseR(){
			return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR.create();
		}

		/**
		 * Bill_Prnt01_DtlBaseブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR> createBill_Prnt01_DtlBaseL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR.class);
		}

		/**
		 * Bill_Prnt01_BpブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR createBill_Prnt01_BpR(){
			return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR.create();
		}

		/**
		 * Bill_Prnt01_BpブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR> createBill_Prnt01_BpL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR.class);
		}

		/**
		 * Bill_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR createBill_Prnt01_CndR(){
			return mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR> up0() {
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
		 * @see mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR
		 */
		public mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrR> down0() {
			return down0;
		}


		/**
		 * [Bill_Prnt01_Bp]ブロックのコンテナaBill_Prnt01_BpLを返します。
		 *
		 * @return Bill_Prnt01_BpL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_BpR> Bill_Prnt01_Bp() {
			return aBill_Prnt01_Bp;
		}

		/**
		 * [Bill_Prnt01_DtlBase]ブロックのコンテナaBill_Prnt01_DtlBaseLを返します。
		 *
		 * @return Bill_Prnt01_DtlBaseL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_DtlBaseR> Bill_Prnt01_DtlBase() {
			return aBill_Prnt01_DtlBase;
		}

		/**
		 * [Bill_Prnt01_HdrBase]ブロックのコンテナaBill_Prnt01_HdrBaseLを返します。
		 *
		 * @return Bill_Prnt01_HdrBaseL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5040.Bill_Prnt01_HdrBaseR> Bill_Prnt01_HdrBase() {
			return aBill_Prnt01_HdrBase;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillPrntService)MSBGL_BillPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}