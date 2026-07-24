package mcframe.serverMSBE.MSBEL5550;

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
 * "MSBEL_ShipRprtPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipRprtPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5550";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipRprtPrntService.ShipRprt_Upd01 aShipRprt_Upd01;

	protected void initShipRprt_Upd01() {
		this.info = PDef.MS_MSBEL5550_ShipRprt_Upd01_INFO;
		this.aShipRprt_Upd01 = ((MSBEL_ShipRprtPrntService)this).new ShipRprt_Upd01();
	}

	public static MSBEL_ShipRprtPrntService.ShipRprt_Upd01 crtShipRprt_Upd01() {
		MSBEL_ShipRprtPrntService lgc = new MSBEL_ShipRprtPrntService();
		lgc.initShipRprt_Upd01();
		return lgc.aShipRprt_Upd01;
	}

	protected void paramShipRprt_Upd01(MCParam p) {
		if (this.aShipRprt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipRprt_Upd01.up0());
		p.addUpBlock(aShipRprt_Upd01.up1());
		p.addUpBlock(aShipRprt_Upd01.up2());
		p.addDownBlock(aShipRprt_Upd01.down0());
	}

	protected void doShipRprt_Upd01() {
		aShipRprt_Upd01.call();
	};

	/**
	 * ShipRprt_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR createShipRprt_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR.create();
	}

	/**
	 * ShipRprt_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR> createShipRprt_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR.class);
	}

	/**
	 * ShipRprt_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR createShipRprt_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR.create();
	}

	/**
	 * ShipRprt_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR> createShipRprt_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR.class);
	}

	/**
	 * ShipRprt_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR createShipRprt_Upd01_CndR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
	}
	protected MSBEL_ShipRprtPrntService.ShipRprt_Upd02 aShipRprt_Upd02;

	protected void initShipRprt_Upd02() {
		this.info = PDef.MS_MSBEL5550_ShipRprt_Upd02_INFO;
		this.aShipRprt_Upd02 = ((MSBEL_ShipRprtPrntService)this).new ShipRprt_Upd02();
	}

	public static MSBEL_ShipRprtPrntService.ShipRprt_Upd02 crtShipRprt_Upd02() {
		MSBEL_ShipRprtPrntService lgc = new MSBEL_ShipRprtPrntService();
		lgc.initShipRprt_Upd02();
		return lgc.aShipRprt_Upd02;
	}

	protected void paramShipRprt_Upd02(MCParam p) {
		if (this.aShipRprt_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipRprt_Upd02.up0());
	}

	protected void doShipRprt_Upd02() {
		aShipRprt_Upd02.call();
	};

	/**
	 * ShipRprt_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR createShipRprt_Upd02_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR.create();
	}

	/**
	 * ShipRprt_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR> createShipRprt_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR.class);
	}
	protected MSBEL_ShipRprtPrntService.ShipRprt_Upd03 aShipRprt_Upd03;

	protected void initShipRprt_Upd03() {
		this.info = PDef.MS_MSBEL5550_ShipRprt_Upd03_INFO;
		this.aShipRprt_Upd03 = ((MSBEL_ShipRprtPrntService)this).new ShipRprt_Upd03();
	}

	public static MSBEL_ShipRprtPrntService.ShipRprt_Upd03 crtShipRprt_Upd03() {
		MSBEL_ShipRprtPrntService lgc = new MSBEL_ShipRprtPrntService();
		lgc.initShipRprt_Upd03();
		return lgc.aShipRprt_Upd03;
	}

	protected void paramShipRprt_Upd03(MCParam p) {
		if (this.aShipRprt_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipRprt_Upd03.up0());
		p.addDownBlock(aShipRprt_Upd03.down0());
	}

	protected void doShipRprt_Upd03() {
		aShipRprt_Upd03.call();
	};

	/**
	 * ShipRprt_Upd03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR createShipRprt_Upd03_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR.create();
	}

	/**
	 * ShipRprt_Upd03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR> createShipRprt_Upd03_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR.class);
	}
	protected MSBEL_ShipRprtPrntService.ShipRprt_Del01 aShipRprt_Del01;

	protected void initShipRprt_Del01() {
		this.info = PDef.MS_MSBEL5550_ShipRprt_Del01_INFO;
		this.aShipRprt_Del01 = ((MSBEL_ShipRprtPrntService)this).new ShipRprt_Del01();
	}

	public static MSBEL_ShipRprtPrntService.ShipRprt_Del01 crtShipRprt_Del01() {
		MSBEL_ShipRprtPrntService lgc = new MSBEL_ShipRprtPrntService();
		lgc.initShipRprt_Del01();
		return lgc.aShipRprt_Del01;
	}

	protected void paramShipRprt_Del01(MCParam p) {
		if (this.aShipRprt_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipRprt_Del01.up0());
	}

	protected void doShipRprt_Del01() {
		aShipRprt_Del01.call();
	};

	/**
	 * ShipRprt_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR createShipRprt_Del01_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR.create();
	}

	/**
	 * ShipRprt_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR> createShipRprt_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR.class);
	}
	protected MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 aShipRprt_Prnt01;

	protected void initShipRprt_Prnt01() {
		this.info = PDef.MS_MSBEL5550_ShipRprt_Prnt01_INFO;
		this.aShipRprt_Prnt01 = ((MSBEL_ShipRprtPrntService)this).new ShipRprt_Prnt01();
	}

	public static MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 crtShipRprt_Prnt01() {
		MSBEL_ShipRprtPrntService lgc = new MSBEL_ShipRprtPrntService();
		lgc.initShipRprt_Prnt01();
		return lgc.aShipRprt_Prnt01;
	}

	protected void paramShipRprt_Prnt01(MCParam p) {
		if (this.aShipRprt_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipRprt_Prnt01.up0());
		p.addUpBlock(aShipRprt_Prnt01.up1());
		p.addDownBlock(aShipRprt_Prnt01.down0());
	}

	protected void doShipRprt_Prnt01() {
		aShipRprt_Prnt01.call();
	};

	/**
	 * ShipRprt_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR createShipRprt_Prnt01_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.create();
	}

	/**
	 * ShipRprt_Prnt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR> createShipRprt_Prnt01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.class);
	}

	/**
	 * ShipRprt_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR createShipRprt_Prnt01_CndR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
	}
	protected MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 aShipRprt_Prnt02;

	protected void initShipRprt_Prnt02() {
		this.info = PDef.MS_MSBEL5550_ShipRprt_Prnt02_INFO;
		this.aShipRprt_Prnt02 = ((MSBEL_ShipRprtPrntService)this).new ShipRprt_Prnt02();
	}

	public static MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 crtShipRprt_Prnt02() {
		MSBEL_ShipRprtPrntService lgc = new MSBEL_ShipRprtPrntService();
		lgc.initShipRprt_Prnt02();
		return lgc.aShipRprt_Prnt02;
	}

	protected void paramShipRprt_Prnt02(MCParam p) {
		if (this.aShipRprt_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipRprt_Prnt02.up0());
		p.addUpBlock(aShipRprt_Prnt02.up1());
		p.addDownBlock(aShipRprt_Prnt02.down0());
	}

	protected void doShipRprt_Prnt02() {
		aShipRprt_Prnt02.call();
	};

	/**
	 * ShipRprt_Prnt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR createShipRprt_Prnt02_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR.create();
	}

	/**
	 * ShipRprt_Prnt02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR> createShipRprt_Prnt02_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR.class);
	}

	/**
	 * ShipRprt_Prnt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR createShipRprt_Prnt02_CndR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipRprt_Upd01オペレーション.<p>
	 *
	 * 納品伝票・明細トランザクションの作成・更新(削除含む)と納品書発行する<br>
	 */
	abstract public class ShipRprt_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipRprt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipRprt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR.class);

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
			invoke((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipRprt_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR createShipRprt_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR.create();
		}

		/**
		 * ShipRprt_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR> createShipRprt_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR.class);
		}

		/**
		 * ShipRprt_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR createShipRprt_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR.create();
		}

		/**
		 * ShipRprt_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR> createShipRprt_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR.class);
		}

		/**
		 * ShipRprt_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR createShipRprt_Upd01_CndR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>r_inst_no</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ds.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ds.slo_no</td></tr>
		 * 	<tr><td><br></td><td>ds.trn_typ</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_slip_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_slip_act_no</td></tr>
		 * 	<tr><td><br></td><td>ds.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.ship_tm</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>ds.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ds.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>ds.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ds.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.xrate</td></tr>
		 * 	<tr><td><br></td><td>ds.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ds.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>ds.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ds.xfr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ds.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ds.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>ds.adjst_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ds.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ds.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ds.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ds.ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ds.sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>cststk_ship_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_uniq_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dsd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dsd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dsd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dsd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dsd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dsd.sno1</td></tr>
		 * 	<tr><td><br></td><td>dsd.sno2</td></tr>
		 * 	<tr><td><br></td><td>dsd.sno3</td></tr>
		 * 	<tr><td><br></td><td>dsd.sno4</td></tr>
		 * 	<tr><td><br></td><td>dsd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.lot_plural_flg</td></tr>
		 * 	<tr><td><br></td><td>dsd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.sublot_plural_flg</td></tr>
		 * 	<tr><td><br></td><td>dsd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.fix_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>dsd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>dsd.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dsd.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dsd.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dsd.io_typ</td></tr>
		 * 	<tr><td><br></td><td>dsd.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dsd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dsd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dsd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dsd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>dsd.ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.ship_dlv_slip_multi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_uniq_no</td></tr>
		 * 	<tr><td><br></td><td>upded_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dsd.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this).info;
		}


	}
	/**
	 * ShipRprt_Upd02オペレーション.<p>
	 *
	 * 納品伝票トランザクションの各種発行済フラグを更新する<br>
	 */
	abstract public class ShipRprt_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipRprt_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR> up0;
		
		
		// コンストラクタ
		protected ShipRprt_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR.class);

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
			invoke((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipRprt_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR createShipRprt_Upd02_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR.create();
		}

		/**
		 * ShipRprt_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR> createShipRprt_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_act_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slip_prnt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_prnt_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this).info;
		}


	}
	/**
	 * ShipRprt_Upd03オペレーション.<p>
	 *
	 * 仕入直送の納品伝票・明細トランザクションを作成する<br>
	 */
	abstract public class ShipRprt_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipRprt_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR> down0;
		
		
		// コンストラクタ
		protected ShipRprt_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR.class);

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
			invoke((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipRprt_Upd03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR createShipRprt_Upd03_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR.create();
		}

		/**
		 * ShipRprt_Upd03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR> createShipRprt_Upd03_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd03_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this).info;
		}


	}
	/**
	 * ShipRprt_Del01オペレーション.<p>
	 *
	 * 納品伝票・明細トランザクションを削除する<br>
	 */
	abstract public class ShipRprt_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipRprt_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR> up0;
		
		
		// コンストラクタ
		protected ShipRprt_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR.class);

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
			invoke((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipRprt_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR createShipRprt_Del01_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR.create();
		}

		/**
		 * ShipRprt_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR> createShipRprt_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Del01_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this).info;
		}


	}
	/**
	 * ShipRprt_Prnt01オペレーション.<p>
	 *
	 * 納品書、出荷案内書を発行する<br>
	 */
	abstract public class ShipRprt_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipRprt_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR> down0;
		
		
		// コンストラクタ
		protected ShipRprt_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.class);
			up1 = mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.class);

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
			invoke((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipRprt_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR createShipRprt_Prnt01_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.create();
		}

		/**
		 * ShipRprt_Prnt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR> createShipRprt_Prnt01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.class);
		}

		/**
		 * ShipRprt_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR createShipRprt_Prnt01_CndR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_can_flg</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>enf_pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>enf_pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this).info;
		}


	}
	/**
	 * ShipRprt_Prnt02オペレーション.<p>
	 *
	 * 納品書、出荷案内書、指図書・ピッキングリストを発行する<br>
	 */
	abstract public class ShipRprt_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipRprt_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR> down0;
		
		
		// コンストラクタ
		protected ShipRprt_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR.class);
			up1 = mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR.class);

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
			invoke((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipRprt_Prnt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR createShipRprt_Prnt02_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR.create();
		}

		/**
		 * ShipRprt_Prnt02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR> createShipRprt_Prnt02_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR.class);
		}

		/**
		 * ShipRprt_Prnt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR createShipRprt_Prnt02_CndR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipRprtPrntService)MSBEL_ShipRprtPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}