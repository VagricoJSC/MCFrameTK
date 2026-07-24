package mcframe.serverMSBF.MSBFL5070;

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
 * "MSBFL_InspActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_InspActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_InspActRcptIFService.InspActIF_Upd01 aInspActIF_Upd01;

	protected void initInspActIF_Upd01() {
		this.info = PDef.MS_MSBFL5070_InspActIF_Upd01_INFO;
		this.aInspActIF_Upd01 = ((MSBFL_InspActRcptIFService)this).new InspActIF_Upd01();
	}

	public static MSBFL_InspActRcptIFService.InspActIF_Upd01 crtInspActIF_Upd01() {
		MSBFL_InspActRcptIFService lgc = new MSBFL_InspActRcptIFService();
		lgc.initInspActIF_Upd01();
		return lgc.aInspActIF_Upd01;
	}

	protected void paramInspActIF_Upd01(MCParam p) {
		if (this.aInspActIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActIF_Upd01.up0());
		p.addUpBlock(aInspActIF_Upd01.up1());
		p.addUpBlock(aInspActIF_Upd01.up2());
		p.addUpBlock(aInspActIF_Upd01.up3());
		p.addDownBlock(aInspActIF_Upd01.down0());
		p.addDownBlock(aInspActIF_Upd01.down1());
		p.addDownBlock(aInspActIF_Upd01.down2());
	}

	protected void doInspActIF_Upd01() {
		aInspActIF_Upd01.call();
	};

	/**
	 * InspActIF_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR createInspActIF_Upd01_CtrlR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR.create();
	}

	/**
	 * InspActIF_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR createInspActIF_Upd01_HdrR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR.create();
	}

	/**
	 * InspActIF_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR> createInspActIF_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR.class);
	}

	/**
	 * InspActIF_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR createInspActIF_Upd01_DtlR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR.create();
	}

	/**
	 * InspActIF_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR> createInspActIF_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR.class);
	}

	/**
	 * InspActIF_Upd01_SmplブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR createInspActIF_Upd01_SmplR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR.create();
	}

	/**
	 * InspActIF_Upd01_SmplブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR> createInspActIF_Upd01_SmplL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR.class);
	}
	protected MSBFL_InspActRcptIFService.InspActIF_Upd02 aInspActIF_Upd02;

	protected void initInspActIF_Upd02() {
		this.info = PDef.MS_MSBFL5070_InspActIF_Upd02_INFO;
		this.aInspActIF_Upd02 = ((MSBFL_InspActRcptIFService)this).new InspActIF_Upd02();
	}

	public static MSBFL_InspActRcptIFService.InspActIF_Upd02 crtInspActIF_Upd02() {
		MSBFL_InspActRcptIFService lgc = new MSBFL_InspActRcptIFService();
		lgc.initInspActIF_Upd02();
		return lgc.aInspActIF_Upd02;
	}

	protected void paramInspActIF_Upd02(MCParam p) {
		if (this.aInspActIF_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActIF_Upd02.up0());
		p.addUpBlock(aInspActIF_Upd02.up1());
		p.addUpBlock(aInspActIF_Upd02.up2());
		p.addDownBlock(aInspActIF_Upd02.down0());
		p.addDownBlock(aInspActIF_Upd02.down1());
	}

	protected void doInspActIF_Upd02() {
		aInspActIF_Upd02.call();
	};

	/**
	 * InspActIF_Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR createInspActIF_Upd02_CtrlR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR.create();
	}

	/**
	 * InspActIF_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR createInspActIF_Upd02_HdrR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR.create();
	}

	/**
	 * InspActIF_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR> createInspActIF_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR.class);
	}

	/**
	 * InspActIF_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR createInspActIF_Upd02_DtlR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR.create();
	}

	/**
	 * InspActIF_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR> createInspActIF_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR.class);
	}
	protected MSBFL_InspActRcptIFService.InspActIF_Del01 aInspActIF_Del01;

	protected void initInspActIF_Del01() {
		this.info = PDef.MS_MSBFL5070_InspActIF_Del01_INFO;
		this.aInspActIF_Del01 = ((MSBFL_InspActRcptIFService)this).new InspActIF_Del01();
	}

	public static MSBFL_InspActRcptIFService.InspActIF_Del01 crtInspActIF_Del01() {
		MSBFL_InspActRcptIFService lgc = new MSBFL_InspActRcptIFService();
		lgc.initInspActIF_Del01();
		return lgc.aInspActIF_Del01;
	}

	protected void paramInspActIF_Del01(MCParam p) {
		if (this.aInspActIF_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActIF_Del01.up0());
		p.addUpBlock(aInspActIF_Del01.up1());
		p.addDownBlock(aInspActIF_Del01.down0());
	}

	protected void doInspActIF_Del01() {
		aInspActIF_Del01.call();
	};

	/**
	 * InspActIF_Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR createInspActIF_Del01_CtrlR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR.create();
	}

	/**
	 * InspActIF_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR createInspActIF_Del01_CndR(){
		return mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR.create();
	}

	/**
	 * InspActIF_Del01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR> createInspActIF_Del01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InspActIF_Upd01オペレーション.<p>
	 *
	 * 抜取検査/全数検査の実績を登録・訂正する。<br>
	 */
	abstract public class InspActIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR> down2;
		
		
		// コンストラクタ
		protected InspActIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR.class);

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
			if (i == 3) return up3();
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
			invoke((MSBFL_InspActRcptIFService)MSBFL_InspActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * InspActIF_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR createInspActIF_Upd01_CtrlR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR.create();
		}

		/**
		 * InspActIF_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR createInspActIF_Upd01_HdrR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR.create();
		}

		/**
		 * InspActIF_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR> createInspActIF_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR.class);
		}

		/**
		 * InspActIF_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR createInspActIF_Upd01_DtlR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR.create();
		}

		/**
		 * InspActIF_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR> createInspActIF_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR.class);
		}

		/**
		 * InspActIF_Upd01_SmplブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR createInspActIF_Upd01_SmplR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR.create();
		}

		/**
		 * InspActIF_Upd01_SmplブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR> createInspActIF_Upd01_SmplL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>insp_freq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ttl_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>ttl_stk_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>st_hm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>end_hm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stt_can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>fix_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_insp_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>so_qty</td></tr>
		 * 	<tr><td><br></td><td>so_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>smpl_qty</td></tr>
		 * 	<tr><td><br></td><td>smpl_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>fix_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>act_hm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>so_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_insp_smpl_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActRcptIFService)MSBFL_InspActRcptIFService_MC_A.this).info;
		}


	}
	/**
	 * InspActIF_Upd02オペレーション.<p>
	 *
	 * 抜取検査/全数検査の実績を判定する。<br>
	 */
	abstract public class InspActIF_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActIF_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR> down1;
		
		
		// コンストラクタ
		protected InspActIF_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR.class);

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
			invoke((MSBFL_InspActRcptIFService)MSBFL_InspActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * InspActIF_Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR createInspActIF_Upd02_CtrlR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR.create();
		}

		/**
		 * InspActIF_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR createInspActIF_Upd02_HdrR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR.create();
		}

		/**
		 * InspActIF_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR> createInspActIF_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR.class);
		}

		/**
		 * InspActIF_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR createInspActIF_Upd02_DtlR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR.create();
		}

		/**
		 * InspActIF_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR> createInspActIF_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_d_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActRcptIFService)MSBFL_InspActRcptIFService_MC_A.this).info;
		}


	}
	/**
	 * InspActIF_Del01オペレーション.<p>
	 *
	 * 抜取検査、または、全数検査の実績情報を取り消す。<br>
	 */
	abstract public class InspActIF_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActIF_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR> down0;
		
		
		// コンストラクタ
		protected InspActIF_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR.class);

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
			invoke((MSBFL_InspActRcptIFService)MSBFL_InspActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspActIF_Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR createInspActIF_Del01_CtrlR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR.create();
		}

		/**
		 * InspActIF_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR createInspActIF_Del01_CndR(){
			return mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR.create();
		}

		/**
		 * InspActIF_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR> createInspActIF_Del01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR
		 */
		public mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>judg_rsn</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActRcptIFService)MSBFL_InspActRcptIFService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}