package mcframe.serverMSBE.MSBEL5090;

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
 * "MSBEL_ShipStkRplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipStkRplService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipStkRplService.ShipStkRpl_Ins01 aShipStkRpl_Ins01;

	protected void initShipStkRpl_Ins01() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_Ins01_INFO;
		this.aShipStkRpl_Ins01 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_Ins01();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_Ins01 crtShipStkRpl_Ins01() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_Ins01();
		return lgc.aShipStkRpl_Ins01;
	}

	protected void paramShipStkRpl_Ins01(MCParam p) {
		if (this.aShipStkRpl_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_Ins01.up0());
		p.addUpBlock(aShipStkRpl_Ins01.up1());
		p.addDownBlock(aShipStkRpl_Ins01.down0());
	}

	protected void doShipStkRpl_Ins01() {
		aShipStkRpl_Ins01.call();
	};

	/**
	 * ShipStkRpl_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
		return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
	}

	/**
	 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
		return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
	}

	/**
	 * ShipStkRpl_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
	}

	/**
	 * ShipStkRpl_CntブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
		return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
	}
	protected MSBEL_ShipStkRplService.ShipStkRpl_Ins02 aShipStkRpl_Ins02;

	protected void initShipStkRpl_Ins02() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_Ins02_INFO;
		this.aShipStkRpl_Ins02 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_Ins02();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_Ins02 crtShipStkRpl_Ins02() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_Ins02();
		return lgc.aShipStkRpl_Ins02;
	}

	protected void paramShipStkRpl_Ins02(MCParam p) {
		if (this.aShipStkRpl_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_Ins02.up0());
		p.addUpBlock(aShipStkRpl_Ins02.up1());
		p.addDownBlock(aShipStkRpl_Ins02.down0());
	}

	protected void doShipStkRpl_Ins02() {
		aShipStkRpl_Ins02.call();
	};
	protected MSBEL_ShipStkRplService.ShipStkRpl_Ins03 aShipStkRpl_Ins03;

	protected void initShipStkRpl_Ins03() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_Ins03_INFO;
		this.aShipStkRpl_Ins03 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_Ins03();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_Ins03 crtShipStkRpl_Ins03() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_Ins03();
		return lgc.aShipStkRpl_Ins03;
	}

	protected void paramShipStkRpl_Ins03(MCParam p) {
		if (this.aShipStkRpl_Ins03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_Ins03.up0());
		p.addUpBlock(aShipStkRpl_Ins03.up1());
		p.addDownBlock(aShipStkRpl_Ins03.down0());
	}

	protected void doShipStkRpl_Ins03() {
		aShipStkRpl_Ins03.call();
	};

	/**
	 * ShipStkRpl_LstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR createShipStkRpl_LstR(){
		return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.create();
	}

	/**
	 * ShipStkRpl_LstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> createShipStkRpl_LstL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
	}
	protected MSBEL_ShipStkRplService.ShipStkRpl_Del01 aShipStkRpl_Del01;

	protected void initShipStkRpl_Del01() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_Del01_INFO;
		this.aShipStkRpl_Del01 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_Del01();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_Del01 crtShipStkRpl_Del01() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_Del01();
		return lgc.aShipStkRpl_Del01;
	}

	protected void paramShipStkRpl_Del01(MCParam p) {
		if (this.aShipStkRpl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_Del01.up0());
		p.addUpBlock(aShipStkRpl_Del01.up1());
		p.addDownBlock(aShipStkRpl_Del01.down0());
	}

	protected void doShipStkRpl_Del01() {
		aShipStkRpl_Del01.call();
	};
	protected MSBEL_ShipStkRplService.ShipStkRpl_LstIns01 aShipStkRpl_LstIns01;

	protected void initShipStkRpl_LstIns01() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_LstIns01_INFO;
		this.aShipStkRpl_LstIns01 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_LstIns01();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_LstIns01 crtShipStkRpl_LstIns01() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_LstIns01();
		return lgc.aShipStkRpl_LstIns01;
	}

	protected void paramShipStkRpl_LstIns01(MCParam p) {
		if (this.aShipStkRpl_LstIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_LstIns01.up0());
		p.addUpBlock(aShipStkRpl_LstIns01.up1());
		p.addDownBlock(aShipStkRpl_LstIns01.down0());
		p.addDownBlock(aShipStkRpl_LstIns01.down1());
	}

	protected void doShipStkRpl_LstIns01() {
		aShipStkRpl_LstIns01.call();
	};
	protected MSBEL_ShipStkRplService.ShipStkRpl_XfrIns01 aShipStkRpl_XfrIns01;

	protected void initShipStkRpl_XfrIns01() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_XfrIns01_INFO;
		this.aShipStkRpl_XfrIns01 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_XfrIns01();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_XfrIns01 crtShipStkRpl_XfrIns01() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_XfrIns01();
		return lgc.aShipStkRpl_XfrIns01;
	}

	protected void paramShipStkRpl_XfrIns01(MCParam p) {
		if (this.aShipStkRpl_XfrIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_XfrIns01.up0());
		p.addUpBlock(aShipStkRpl_XfrIns01.up1());
		p.addDownBlock(aShipStkRpl_XfrIns01.down0());
		p.addDownBlock(aShipStkRpl_XfrIns01.down1());
	}

	protected void doShipStkRpl_XfrIns01() {
		aShipStkRpl_XfrIns01.call();
	};
	protected MSBEL_ShipStkRplService.ShipStkRpl_LstDel01 aShipStkRpl_LstDel01;

	protected void initShipStkRpl_LstDel01() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_LstDel01_INFO;
		this.aShipStkRpl_LstDel01 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_LstDel01();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_LstDel01 crtShipStkRpl_LstDel01() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_LstDel01();
		return lgc.aShipStkRpl_LstDel01;
	}

	protected void paramShipStkRpl_LstDel01(MCParam p) {
		if (this.aShipStkRpl_LstDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_LstDel01.up0());
		p.addDownBlock(aShipStkRpl_LstDel01.down0());
	}

	protected void doShipStkRpl_LstDel01() {
		aShipStkRpl_LstDel01.call();
	};
	protected MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 aShipStkRpl_XfrDel01;

	protected void initShipStkRpl_XfrDel01() {
		this.info = PDef.MS_MSBEL5090_ShipStkRpl_XfrDel01_INFO;
		this.aShipStkRpl_XfrDel01 = ((MSBEL_ShipStkRplService)this).new ShipStkRpl_XfrDel01();
	}

	public static MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 crtShipStkRpl_XfrDel01() {
		MSBEL_ShipStkRplService lgc = new MSBEL_ShipStkRplService();
		lgc.initShipStkRpl_XfrDel01();
		return lgc.aShipStkRpl_XfrDel01;
	}

	protected void paramShipStkRpl_XfrDel01(MCParam p) {
		if (this.aShipStkRpl_XfrDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRpl_XfrDel01.up0());
		p.addUpBlock(aShipStkRpl_XfrDel01.up1());
		p.addDownBlock(aShipStkRpl_XfrDel01.down0());
	}

	protected void doShipStkRpl_XfrDel01() {
		aShipStkRpl_XfrDel01.call();
	};

	/**
	 * ShipStkRpl_XfrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR createShipStkRpl_XfrR(){
		return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR.create();
	}

	/**
	 * ShipStkRpl_XfrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR> createShipStkRpl_XfrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipStkRpl_Ins01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected ShipStkRpl_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();

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
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>ship_io_schd_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_del_of_xfr_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_Ins02オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected ShipStkRpl_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();

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
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>ship_io_schd_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_del_of_xfr_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_Ins03オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_Ins03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_Ins03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> down0;
		
		
		// コンストラクタ
		protected ShipStkRpl_Ins03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);

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
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_LstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR createShipStkRpl_LstR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.create();
		}

		/**
		 * ShipStkRpl_LstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> createShipStkRpl_LstL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rl.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_Del01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected ShipStkRpl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();

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
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_stk_rpl_lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_LstIns01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_LstIns01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_LstIns01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down1;
		
		
		// コンストラクタ
		protected ShipStkRpl_LstIns01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
			down1 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
		}

		/**
		 * ShipStkRpl_LstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR createShipStkRpl_LstR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.create();
		}

		/**
		 * ShipStkRpl_LstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> createShipStkRpl_LstL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rl.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>rl.schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_io_schd_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_crt_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_XfrIns01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_XfrIns01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_XfrIns01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down1;
		
		
		// コンストラクタ
		protected ShipStkRpl_XfrIns01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
			down1 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_LstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR createShipStkRpl_LstR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.create();
		}

		/**
		 * ShipStkRpl_LstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> createShipStkRpl_LstL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rl.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>rl.schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rl.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_LstR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_of_xfr_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_LstDel01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_LstDel01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_LstDel01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected ShipStkRpl_LstDel01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();

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
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRpl_XfrDel01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRpl_XfrDel01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRpl_XfrDel01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0;
		/** [ShipStkRpl_Xfr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR> aShipStkRpl_Xfr;
		
		
		// コンストラクタ
		protected ShipStkRpl_XfrDel01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
			aShipStkRpl_Xfr = MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR.class);

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
			invoke((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR createShipStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR createShipStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.create();
		}

		/**
		 * ShipStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> createShipStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR.class);
		}

		/**
		 * ShipStkRpl_XfrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR createShipStkRpl_XfrR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR.create();
		}

		/**
		 * ShipStkRpl_XfrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR> createShipStkRpl_XfrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR.class);
		}

		/**
		 * ShipStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR createShipStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5090.ShipStkRpl_CntR down0() {
			return down0;
		}


		/**
		 * [ShipStkRpl_Xfr]ブロックのコンテナaShipStkRpl_XfrLを返します。
		 *
		 * @return ShipStkRpl_XfrL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5090.ShipStkRpl_XfrR> ShipStkRpl_Xfr() {
			return aShipStkRpl_Xfr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipStkRplService)MSBEL_ShipStkRplService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}