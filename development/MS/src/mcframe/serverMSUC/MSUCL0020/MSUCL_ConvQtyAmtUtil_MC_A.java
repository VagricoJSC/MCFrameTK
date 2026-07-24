package mcframe.serverMSUC.MSUCL0020;

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
 * "MSUCL_ConvQtyAmtUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUCL_ConvQtyAmtUtil_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSUCL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc01 aConvQtyAmtUtil_Calc01;

	protected void initConvQtyAmtUtil_Calc01() {
		this.info = PDef.MS_MSUCL0020_ConvQtyAmtUtil_Calc01_INFO;
		this.aConvQtyAmtUtil_Calc01 = ((MSUCL_ConvQtyAmtUtil)this).new ConvQtyAmtUtil_Calc01();
	}

	public static MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc01 crtConvQtyAmtUtil_Calc01() {
		MSUCL_ConvQtyAmtUtil lgc = new MSUCL_ConvQtyAmtUtil();
		lgc.initConvQtyAmtUtil_Calc01();
		return lgc.aConvQtyAmtUtil_Calc01;
	}

	protected void paramConvQtyAmtUtil_Calc01(MCParam p) {
		if (this.aConvQtyAmtUtil_Calc01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvQtyAmtUtil_Calc01.up0());
		p.addUpBlock(aConvQtyAmtUtil_Calc01.up1());
		p.addDownBlock(aConvQtyAmtUtil_Calc01.down0());
		p.addDownBlock(aConvQtyAmtUtil_Calc01.down1());
	}

	protected void doConvQtyAmtUtil_Calc01() {
		aConvQtyAmtUtil_Calc01.call();
	};

	/**
	 * ConvQtyAmtUtil_Calc01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR createConvQtyAmtUtil_Calc01_HdrR(){
		return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.create();
	}

	/**
	 * ConvQtyAmtUtil_Calc01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> createConvQtyAmtUtil_Calc01_HdrL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
	}

	/**
	 * ConvQtyAmtUtil_Calc01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R createConvQtyAmtUtil_Calc01_Dtl1R(){
		return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.create();
	}

	/**
	 * ConvQtyAmtUtil_Calc01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> createConvQtyAmtUtil_Calc01_Dtl1L(){
		return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
	}

	/**
	 * ConvQtyAmtUtil_Calc01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R createConvQtyAmtUtil_Calc01_Dtl2R(){
		return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.create();
	}

	/**
	 * ConvQtyAmtUtil_Calc01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> createConvQtyAmtUtil_Calc01_Dtl2L(){
		return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
	}
	protected MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 aConvQtyAmtUtil_Calc02;

	protected void initConvQtyAmtUtil_Calc02() {
		this.info = PDef.MS_MSUCL0020_ConvQtyAmtUtil_Calc02_INFO;
		this.aConvQtyAmtUtil_Calc02 = ((MSUCL_ConvQtyAmtUtil)this).new ConvQtyAmtUtil_Calc02();
	}

	public static MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 crtConvQtyAmtUtil_Calc02() {
		MSUCL_ConvQtyAmtUtil lgc = new MSUCL_ConvQtyAmtUtil();
		lgc.initConvQtyAmtUtil_Calc02();
		return lgc.aConvQtyAmtUtil_Calc02;
	}

	protected void paramConvQtyAmtUtil_Calc02(MCParam p) {
		if (this.aConvQtyAmtUtil_Calc02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvQtyAmtUtil_Calc02.up0());
		p.addUpBlock(aConvQtyAmtUtil_Calc02.up1());
		p.addDownBlock(aConvQtyAmtUtil_Calc02.down0());
	}

	protected void doConvQtyAmtUtil_Calc02() {
		aConvQtyAmtUtil_Calc02.call();
	};

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR createHdrR(){
		return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.create();
	}

	/**
	 * HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> createHdrL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
	}

	/**
	 * Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R createDtl1R(){
		return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.create();
	}

	/**
	 * Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> createDtl1L(){
		return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
	}
	protected MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc03 aConvQtyAmtUtil_Calc03;

	protected void initConvQtyAmtUtil_Calc03() {
		this.info = PDef.MS_MSUCL0020_ConvQtyAmtUtil_Calc03_INFO;
		this.aConvQtyAmtUtil_Calc03 = ((MSUCL_ConvQtyAmtUtil)this).new ConvQtyAmtUtil_Calc03();
	}

	public static MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc03 crtConvQtyAmtUtil_Calc03() {
		MSUCL_ConvQtyAmtUtil lgc = new MSUCL_ConvQtyAmtUtil();
		lgc.initConvQtyAmtUtil_Calc03();
		return lgc.aConvQtyAmtUtil_Calc03;
	}

	protected void paramConvQtyAmtUtil_Calc03(MCParam p) {
		if (this.aConvQtyAmtUtil_Calc03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvQtyAmtUtil_Calc03.up0());
		p.addUpBlock(aConvQtyAmtUtil_Calc03.up1());
		p.addUpBlock(aConvQtyAmtUtil_Calc03.up2());
		p.addDownBlock(aConvQtyAmtUtil_Calc03.down0());
	}

	protected void doConvQtyAmtUtil_Calc03() {
		aConvQtyAmtUtil_Calc03.call();
	};

	/**
	 * Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R createDtl2R(){
		return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.create();
	}

	/**
	 * Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> createDtl2L(){
		return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
	}
	protected MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc04 aConvQtyAmtUtil_Calc04;

	protected void initConvQtyAmtUtil_Calc04() {
		this.info = PDef.MS_MSUCL0020_ConvQtyAmtUtil_Calc04_INFO;
		this.aConvQtyAmtUtil_Calc04 = ((MSUCL_ConvQtyAmtUtil)this).new ConvQtyAmtUtil_Calc04();
	}

	public static MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc04 crtConvQtyAmtUtil_Calc04() {
		MSUCL_ConvQtyAmtUtil lgc = new MSUCL_ConvQtyAmtUtil();
		lgc.initConvQtyAmtUtil_Calc04();
		return lgc.aConvQtyAmtUtil_Calc04;
	}

	protected void paramConvQtyAmtUtil_Calc04(MCParam p) {
		if (this.aConvQtyAmtUtil_Calc04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aConvQtyAmtUtil_Calc04.up0());
		p.addUpBlock(aConvQtyAmtUtil_Calc04.up1());
		p.addUpBlock(aConvQtyAmtUtil_Calc04.up2());
		p.addDownBlock(aConvQtyAmtUtil_Calc04.down0());
		p.addDownBlock(aConvQtyAmtUtil_Calc04.down1());
	}

	protected void doConvQtyAmtUtil_Calc04() {
		aConvQtyAmtUtil_Calc04.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ConvQtyAmtUtil_Calc01オペレーション.<p>
	 *
	 * 下段リストから上段リストの数量を計算する。<br>
	 */
	abstract public class ConvQtyAmtUtil_Calc01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvQtyAmtUtil_Calc01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> down1;
		
		
		// コンストラクタ
		protected ConvQtyAmtUtil_Calc01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);

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
			invoke((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ConvQtyAmtUtil_Calc01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR createConvQtyAmtUtil_Calc01_HdrR(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.create();
		}

		/**
		 * ConvQtyAmtUtil_Calc01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> createConvQtyAmtUtil_Calc01_HdrL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
		}

		/**
		 * ConvQtyAmtUtil_Calc01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R createConvQtyAmtUtil_Calc01_Dtl1R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.create();
		}

		/**
		 * ConvQtyAmtUtil_Calc01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> createConvQtyAmtUtil_Calc01_Dtl1L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
		}

		/**
		 * ConvQtyAmtUtil_Calc01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R createConvQtyAmtUtil_Calc01_Dtl2R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.create();
		}

		/**
		 * ConvQtyAmtUtil_Calc01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> createConvQtyAmtUtil_Calc01_Dtl2L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>grp_no</td></tr>
		 * 	<tr><td><br></td><td>grp_no2</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_rnd_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this).info;
		}


	}
	/**
	 * ConvQtyAmtUtil_Calc02オペレーション.<p>
	 *
	 * 上段リストの金額を計算する。<br>
	 */
	abstract public class ConvQtyAmtUtil_Calc02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvQtyAmtUtil_Calc02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> down0;
		
		
		// コンストラクタ
		protected ConvQtyAmtUtil_Calc02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);

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
			invoke((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR createHdrR(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> createHdrL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
		}

		/**
		 * Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R createDtl1R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.create();
		}

		/**
		 * Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> createDtl1L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>act_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>act_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt_input_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this).info;
		}


	}
	/**
	 * ConvQtyAmtUtil_Calc03オペレーション.<p>
	 *
	 * 上段リストから下段リストの金額を計算する。<br>
	 */
	abstract public class ConvQtyAmtUtil_Calc03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvQtyAmtUtil_Calc03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> down0;
		
		
		// コンストラクタ
		protected ConvQtyAmtUtil_Calc03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);

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
			invoke((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR createHdrR(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> createHdrL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
		}

		/**
		 * Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R createDtl1R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.create();
		}

		/**
		 * Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> createDtl1L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
		}

		/**
		 * Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R createDtl2R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.create();
		}

		/**
		 * Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> createDtl2L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this).info;
		}


	}
	/**
	 * ConvQtyAmtUtil_Calc04オペレーション.<p>
	 *
	 * 上段・下段の金額計算処理(Calc02、Calc03)をまとめて実施する。<br>
	 */
	abstract public class ConvQtyAmtUtil_Calc04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ConvQtyAmtUtil_Calc04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> down1;
		
		
		// コンストラクタ
		protected ConvQtyAmtUtil_Calc04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);

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
			invoke((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR createHdrR(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> createHdrL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
		}

		/**
		 * Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R createDtl1R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.create();
		}

		/**
		 * Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> createDtl1L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
		}

		/**
		 * Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R createDtl2R(){
			return mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.create();
		}

		/**
		 * Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> createDtl2L(){
			return MCList.create(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>act_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>act_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt_input_flg</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>grp_no</td></tr>
		 * 	<tr><td><br></td><td>grp_no2</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_ConvQtyAmtUtil)MSUCL_ConvQtyAmtUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}